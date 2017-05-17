package com.kimjinhwan.mybbs.view;

import java.util.Scanner;

import com.kimjinhwan.mybbs.model.Bbs;

public class BbsInput {

	public Bbs process(Scanner scanner) { // 이미 생성자로 만들어 놨기 때문에 가능함.
		System.out.println("제목을 입력 하세요.");
		String title = scanner.nextLine();
		System.out.println("작성자를 입력 하세요.");
		String author = scanner.nextLine();
		System.out.println("내용을 입력 하세요.");
		String content = scanner.nextLine();

		Bbs bbs = new Bbs();
		bbs.setTitle(title);
		bbs.setAuthor(author);
		bbs.setContent(content);

		return bbs;
	}
}
