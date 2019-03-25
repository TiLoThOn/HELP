package com.manager.service;

import java.util.List;
import java.util.Scanner;

import com.manager.dao.MenuDAO;
import com.manager.domain.Menu;

public class MenuService {

	private MenuDAO mdao = new MenuDAO();

	public void menu01_1(Scanner sc) {

		List<Menu> list = mdao.list();

		System.out.println("버거 종류");
		this.print(list);
		System.out.println("선택(번호)>");
		int idx = sc.nextInt();
		sc.nextLine();
		this.mdao.get(idx - 1);
		System.out.print("수정한 버거 이름>");
		String menu = sc.nextLine();

		System.out.print("수정한 버거 가격>");
		int mprice = sc.nextInt();
		sc.nextLine();

		System.out.println("버거를 수정할까요? 1 : 수정 0 : 취소");
		System.out.print("입력>");
		int m_ = sc.nextInt();
		sc.nextLine();
		if (m_ == 1) {
			Menu s1 = new Menu(menu, mprice);
			this.mdao.set(idx - 1, s1);
			System.out.println("버거가 수정되었습니다.");
		} else if (m_ == 0) {
			System.out.println("버거가 수정이 취소되었습니다.");
		}
	}

	public void menu02_1(Scanner sc) {

		List<Menu> list = mdao.list();
		
		System.out.println("버거 종류");
		this.print(list);

		System.out.print("신규 버거 이름>");
		String menu = sc.nextLine();

		System.out.print("신규 버거 가격>");
		int mprice = sc.nextInt();
		sc.nextLine();

		System.out.println("신규 버거를 등록할까요? 1 : 등록 0 : 취소");
		System.out.print("입력>");
		int m_ = sc.nextInt();
		sc.nextLine();
		if (m_ == 1) {
			Menu s1 = new Menu(menu, mprice);
			this.mdao.add(s1);
			System.out.println("신규 버거가 등록되었습니다.");
		} else if (m_ == 0) {
			System.out.println("신규 버거가 등록이 취소되었습니다.");
		}

	}

	public void menu03_1(Scanner sc) {
		
		List<Menu> list = mdao.list();
		
		System.out.println("버거 종류");
		this.print(list);

		System.out.println("선택(번호)>");
		int idx = sc.nextInt();
		sc.nextLine();
		this.mdao.get(idx - 1);

		System.out.println("버거를 삭제할까요? 1 : 삭제 0 : 취소");
		System.out.print("입력>");
		int m_ = sc.nextInt();
		sc.nextLine();

		if (m_ == 1) {
			this.mdao.remove(idx - 1);
			System.out.println("버거가 삭제되었습니다.");
		} else if (m_ == 0) {
			System.out.println("버거가 삭제가 취소되었습니다.");
		}

	}

	private void print(List<Menu> list) {
		int count = 1;
		// 결과 출력 메소드
		System.out.println("버거 / 가격");
		// 사본 배열의 전체 자료 출력
		for (Menu s : list) {
			// toString() 메소드 호출
			System.out.printf("%d. ", count);
			System.out.println(s.toString());
			++count;
		}
	}

}
//추가, 수정시 객체 생성 후 덮어쓸 때 객체 생성을 DAO에서 하면 수정이 안 되고 추가됨 왜? 이것도 뭐가 다른가?