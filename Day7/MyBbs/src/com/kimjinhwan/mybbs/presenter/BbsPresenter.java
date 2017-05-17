package com.kimjinhwan.mybbs.presenter;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

import com.kimjinhwan.mybbs.model.Bbs;
import com.kimjinhwan.mybbs.model.BbsLoader;
import com.kimjinhwan.mybbs.view.BbsDetail;
import com.kimjinhwan.mybbs.view.BbsInput;
import com.kimjinhwan.mybbs.view.BbsList;

public class BbsPresenter {

	final boolean START = true;
	final boolean FINISH = false;
	boolean runFlag = START;

	// 데이터 임시 저장소
	ArrayList<Bbs> datas;

	Scanner scanner;
	BbsInput input;
	BbsList list;
	BbsDetail detail;
	BbsLoader loader;

	int number = 0; // 글번호를 저장할 전역변수. 글을 지웠을 때 글번호를 매기는 로직이 꼬이지 않도록.

	public BbsPresenter() { // 생성자. 리턴타입은 필요없으나 접근제한자는 필요.
		init();
	}

	/**
	 * 초기화 함수 : 사용할 객체들을 미리 메모리에 로드해둔다.
	 */
	private void init() {
		scanner = new Scanner(System.in);
		input = new BbsInput();
		datas = new ArrayList<>();
		list = new BbsList();
		detail = new BbsDetail();
		loader = new BbsLoader();
	}

	public void start() {

		while (runFlag) { // while문 안에서 new는 데이터를 처리할 때에만 사용할 것.
			System.out.println("명령어를 입력하세요. [l.목록, w:쓰기, r.상세보기]");
			String command = scanner.nextLine();
			switch (command) {
			case "l":
				datas = loader.read();
				list.showList(datas);
				break;
			case "w":
				write();
				break;
			case "r":
				goDetail();
				break;
			}
		}
	}

	// 데이터를 입력받아 저장하기 위한 명령
	public void write() {
		Bbs bbs = input.process(scanner);
		number = number + 1;
		bbs.setId(number);
		bbs.setDate(getDate());

		loader.write(bbs);
		//datas.add(bbs);

	}

	private String getDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		long currentTime = System.currentTimeMillis();
		return sdf.format(currentTime);
	}

	// 상세보기로 이동
	public void goDetail(/* ArrayList<Bbs> datas, long id */) {
		System.out.println("글번호를 입력하세요");
		String temp = scanner.nextLine();
		long id = Long.parseLong(temp);
		for (Bbs bbs : datas) {
			if (bbs.getId() == id) {
				BbsDetail detail = new BbsDetail();
				detail.showNo(bbs.getId());
				detail.showTitle(bbs.getTitle());
				detail.showAuthor(bbs.getAuthor());
				detail.showDate(bbs.getDate());
				detail.showContent(bbs.getContent());
				detail.endDetail(bbs.getEnd());
				// detail.showDetail(bbs);
				break; // 조건문에 부합되면 반복문을 중지한다.
			}
		}
	}

	public void end() {
		runFlag = FINISH;
	}
}
