package com.manager.domain;

public class Menu {

   private String menu;
   private int mprice;

   public Menu() {
   }

   public Menu(String menu, int mprice) {
      this.menu = menu;
      this.mprice = mprice;
   }

   public String getMenu() {
      return menu;
   }

   public void setMenu(String menu) {
      this.menu = menu;
   }

   public int getMprice() {
      return mprice;
   }

   public void setMprice(int mprice) {
      this.mprice = mprice;
   }

   @Override
   public String toString() {
      return String.format("%s(%d원)%n", this.menu, this.mprice);
   }

}