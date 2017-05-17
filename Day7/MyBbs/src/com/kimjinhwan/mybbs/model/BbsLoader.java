package com.kimjinhwan.mybbs.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;

public class BbsLoader {

	final String DATABASE_DIRECTORY = "c:/temp/mybbs/";
	final String DATABASE_NAME = "mybbs.db"; // 저장할 파일명은 절대 변경되어서는 안되므로 final을
												// 써줍니다.
	final String COLUMN_SEPERATOR = "@@"; // 한칸 단위
	final String RECORD_SEPERATOR = "\r\n"; // 한줄 단위

	/**
	 * 저장소에서 데이터를 읽어옴.
	 * 
	 * @return 설명 쓰는 란. (여기서는 return이므로 '반환 값에 대한 설명)
	 */
	public ArrayList<Bbs> read() { // 읽어서 넘겨줘야 함.
		ArrayList<Bbs> result = new ArrayList<>();

		// 1. 파일 유무 검사
		File database = new File(DATABASE_DIRECTORY + DATABASE_NAME);
		if (database.exists()) {
		// 2. 있으면 파일을 읽어서 줄단위로 Bbs에 저장한다.
		// 2.1 파일에 빨대를 꽂아서 읽을 준비를 한다.
			BufferedReader br;
			try {
				br = new BufferedReader(
						new InputStreamReader(
							new	FileInputStream(database), "UTF-8"));
		
			String temp = "";
		
				while( (temp = br.readLine()) != null ) {  // readLine파일을 줄 단위로 읽어옴.
					String bbsTemp[] = temp.split(COLUMN_SEPERATOR);
					//Bbs에 담고
					Bbs bbs = new Bbs();
					bbs.setId(Long.parseLong(bbsTemp[0]));
					bbs.setTitle(bbsTemp[1]);
					bbs.setAuthor(bbsTemp[2]);
					bbs.setDate(bbsTemp[3]);
					bbs.setView(Integer.parseInt(bbsTemp[4]));
					bbs.setContent(bbsTemp[5]);
					//완성된 Bbs를 result에 add한다.
					result.add(bbs);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		// TODO 로직

		return result;
	}

	/**
	 * 저장소에 데이터를 저장
	 * 
	 * @param bbs
	 *            // 설명 쓰는 란. (여기서는 변수 value에 대한 설명)
	 */
	public void write(Bbs bbs) {
		// bbs에 있는 데이터를 텍스트 파일에 저장
		// 0.디렉토리가 있는지 검사
		File dir = new File(DATABASE_DIRECTORY);
		if (!dir.exists()) {
			dir.mkdirs(); // mkdir : 경로내에 중간디렉토리가 없으면 생성 안함. mkdirs : 경로내에 있는 모든
							// 디렉토리 생성.
		}
		// 1. 텍스트 파일이 있는지 검사하고 없으면 생성
		File database = new File(DATABASE_DIRECTORY + DATABASE_NAME);
		if (!database.exists()) {
			try { // 에러가 화면에 보이지 않아도 됨. 에러가 화면에 보이게 하려면 함수 끝에 throw.
				database.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		// 2. bbs의 내용을 database 파일에 저장한다.

		// 2.1. 저장하는 데이터의 구조를 설계해야 한다.
		// 2.1.1. 구분자(데이터 간 구분)를 정의한다.
		// 2.2. bbs의 내용을 횡으로 펼친다.

		String oneData = bbs.getId() + COLUMN_SEPERATOR + bbs.getTitle() + COLUMN_SEPERATOR + bbs.getAuthor()
				+ COLUMN_SEPERATOR + bbs.getDate() + COLUMN_SEPERATOR + bbs.getView() + COLUMN_SEPERATOR
				+ bbs.getContent() + RECORD_SEPERATOR;

		// 3. 횡으로 펼쳐진 데이터를 파일의 제일 마지막줄에 저장한다.
		// Path path = Paths.get(DATABASE_DIRECTORY, DATABASE_NAME); // 자바 7버전부터
		// 파일을 다루는 새로운 API인 Path와 Files를 제공한다.
		try {
			/*FileWriter writer = new FileWriter(database, true); // 두 번쨰 인자가
																// append를 허용할
																// 것인지 확인(append
																// : 첨가함.)
																// false로 쓰면
																// 덮어씀.
																 * 
																 */
			Writer writer = new BufferedWriter(
							new OutputStreamWriter(
									new FileOutputStream(database,true),"UTF-8"));
			writer.append(oneData); // 데이터 첨가.
			writer.close(); // 꼭 닫아줘야함.
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
