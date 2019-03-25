package com.manager.dao;

import java.util.ArrayList;
import java.util.List;

import com.manager.domain.Menu;

public class MenuDAO {

   private List<Menu> menus = new ArrayList<Menu>();
   
   public MenuDAO() {
      Menu m1 = new Menu("불고기버거", 5000);
      this.menus.add(m1);
      Menu m2 = new Menu("새우버거", 5500);
      this.menus.add(m2);
      Menu m3 = new Menu("치킨버거", 6000);
      this.menus.add(m3);
   }

   // 지역 객체 추가
   public void add(Menu m) {
      // 외부에서 전달받은 객체를 등록
      // -> 저장소 크기가 자동 증가
      this.menus.add(m);
   }
   //메뉴 수정
   public void set(int a, Menu menu) {
      this.menus.set(a, menu);
   }
   
   //메뉴 삭제
      public void remove(int a) {
         this.menus.remove(a);
      }
   
   //메뉴 확인
   public void get(int a) {
      System.out.println("선택한 버거 : " + this.menus.get(a));
   }
   //전체 출력
   public List<Menu> list() {
      // 사본 컬렉션 준비
      List<Menu> temp = new ArrayList<Menu>();

      // 원본 컬렉션 탐색
      for (Menu r : this.menus) {
         temp.add(r);
      }
      return temp;
   }

}