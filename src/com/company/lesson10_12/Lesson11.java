package com.company.lesson10_12;

public class Lesson11 {
  public static void main(String[] args) {
    int num = 14;
    boolean simple = true;
    if (num < 4) {
      System.out.println("Простое");
    } else {
      for (int x = 2; x < num; x++) {
        if (num % x == 0) {
          simple = false;
        }
      }
    }
    if (simple) {
      System.out.println(num + " простое число");
    } else {
      System.out.println(num + " составное число");
    }
  }
}
