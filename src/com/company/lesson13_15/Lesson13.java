package com.company.lesson13_15;

public class Lesson13 {
  public static void main(String[] args) {
    int number = 153;
    int count = 0; // После нахождения 10 целых чисе выходим из цикла
    System.out.println("Простые числа: ");
    for (int i = 1; i <= number; i++) {
      boolean simple = true;
      if (count == 10) {
        break;
      }
      for (int x = 2; x < i; x++) {
        if (i % x == 0) {
          simple = false;
        }
      }
      if (simple) {
        System.out.print(i + ", ");
        count++;
      }
    }
  }
}
