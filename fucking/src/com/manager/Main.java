package com.manager;

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {

      MainSub sub = new MainSub();
      
      Scanner sc = new Scanner(System.in);

      while (true) {
         System.out.println("--- 매뉴 관리 ---");
         System.out.println("1. 품명 수정 2. 신규 품목 3. 매뉴 삭제 0. 종료");
         System.out.print("선택>");
         int m = sc.nextInt();
         sc.nextLine();
         if (m == 0)
            break;
         switch (m) {
         // 품명 수정
         case 1: sub.menu01(sc); break;
         // 가격 수정
         case 2: sub.menu02(sc); break;
         // 가격 수정
         case 3: sub.menu03(sc); break;
         
         }
      }
      
   sc.close();
   System.out.println("--- 프로그램 종료 ---");
   }

}
