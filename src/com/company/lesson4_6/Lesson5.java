package com.company.lesson4_6;

import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {
        System.out.println("Vvedite dengi");
        Scanner scanner = new Scanner(System.in);
        int money = scanner.nextInt();
        int rub = money%10;
        if(rub==1){
            System.out.println(money + " рубль");
        }else  if (rub==2 || rub ==3 || rub==4){
            System.out.println(money + " рубля");
        }else {
            System.out.println(money + " рублей");
        }
    }
}
