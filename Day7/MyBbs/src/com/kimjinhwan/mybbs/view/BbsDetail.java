package com.kimjinhwan.mybbs.view;

import com.kimjinhwan.mybbs.model.Bbs;

public class BbsDetail {

	public void showNo(long id) {
		System.out.println("글번호 : " + id);
	}

	public void showTitle(String title) {
		System.out.println("제목 : " + title);
	}

	public void showAuthor(String author) {
		System.out.println("작성자 : " + author);
	}

	public void showDate(String date) {
		System.out.println("작성일자 : " + date);
	}

	public void showTitle(int count) {
		System.out.println("조회수 : " + count);
	}

	public void showContent(String content) {
		System.out.println(content);
	}

	public void endDetail(String end) {
		System.out.println("---------게시물 끝--------");
	}

	public void showDetail(Bbs bbs) {
		System.out.println("글번호 : " + bbs.getId());
		System.out.println("제목 : " + bbs.getTitle());
		System.out.println("작성자 : " + bbs.getAuthor());
		System.out.println("작성일자 : " + bbs.getDate());
		System.out.println("조회수 : " + bbs.getView());
		System.out.println(bbs.getContent());
		System.out.println(bbs.getEnd());
	}
}
