package com.company.lessons1_3;

public class Lesson3 {
  public static void main(String[] args) {
    double number = Math.random();
    System.out.println(number);
    StringBuilder s = new StringBuilder();
    while (number > 0) {
      s.insert(0, number % 10);
      number = number / 10;
    }
    s.reverse();
    Character character = s.charAt(0);
    int rightNumber = Character.getNumericValue(character);
    System.out.println(rightNumber);
    if (rightNumber == 7) {
      System.out.println("Последняя цифра является 7");
    } else {
      System.out.println("Последняя цифра не является 7");
    }
  }
}
