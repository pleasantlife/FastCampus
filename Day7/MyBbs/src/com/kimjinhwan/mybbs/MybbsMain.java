package com.kimjinhwan.mybbs;

import com.kimjinhwan.mybbs.presenter.BbsPresenter;

public class MybbsMain {

	public static void main(String[] args) {
		// 설계하는 객체와는 아무 상관이 없으나, 시작 포인트 때문에 필요한 클래스.
		BbsPresenter presenter = new BbsPresenter();
		presenter.start();
	}

}
