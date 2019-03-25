package com.manager;

import java.util.Scanner;

import com.manager.service_Won.MenuService_Won;

public class MainSub {

	MenuService_Won mservice = new MenuService_Won();

	public void menu01(Scanner sc) {

		System.out.println("*수정 할 품명을 선택하세요");
		System.out.println("1. 버거 수정 2. 세트 수정 3. 사이드 수정");
		System.out.print("선택>");
		int m = sc.nextInt();
		sc.nextLine();
		switch (m) {
		// 버거수정
		case 1:
			mservice.menu01_1(sc);
			break;

		}
	}

	public void menu02(Scanner sc) {

		System.out.println("추가 할 품명을 선택하세요");
		System.out.println("1. 버거 추가 2. 세트 추가 3. 사이드 추가");
		System.out.print("선택>");
		int m = sc.nextInt();
		sc.nextLine();
		switch (m) {
		// 버거수정
		case 1:
			mservice.menu02_1(sc);
			break;

		}
	}

	public void menu03(Scanner sc) {
		System.out.println("삭제 할 품명을 선택하세요");
		System.out.println("1. 버거 삭제 2. 세트 삭제 3. 사이드 삭제");
		System.out.print("선택>");
		int m = sc.nextInt();
		sc.nextLine();
		switch (m) {
		// 버거수정
		case 1:
			mservice.menu03_1(sc);
			break;

		}
	}

}