package com.company.lesson22_25;

public class Lesson23 {

  public static void main(String[] args) {
      ATM atm = new ATM(50,50,50);
      atm.withdraw(770);
  }
  static class ATM{
    private int money100;
    private int money50;
    private int money20;

    public void setMoney100(int money100) {
      this.money100 = money100;
    }

    public void setMoney50(int money50) {
      this.money50 = money50;
    }

    public void setMoney20(int money20) {
      this.money20 = money20;
    }

    public ATM(int money100, int money50, int money20) {
      this.money100 = money100;
      this.money50 = money50;
      this.money20 = money20;
    }
    public boolean withdraw(int money){
      int totalCash = (money100*100)+(money50*50)+(money20*20);
      if((totalCash-money)>=0){
        atmWithdraw(money);
        return true;
      }
      System.out.println("Операция не удалась, не достаточно денег");
      return false;

    }
    private void atmWithdraw(int money){
      int money100 = money/100;
      System.out.println("Купюра 100р. :" +money100 + " шт.");
      this.money100-=money100;
      int money50 = (money%100)/50;
      System.out.println("Купюра 100р. :" +money50 + " шт.");
      this.money50-=money50;
      int money20 = ((money%100)%50)/20;
      System.out.println("Купюра 100р. :" +money20 + " шт.");
      this.money20-=money20;
    }
    }
  }

