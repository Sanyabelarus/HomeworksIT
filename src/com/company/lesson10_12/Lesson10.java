package com.company.lesson10_12;

public class Lesson10 {
  public static void main(String[] args) {
    int number = 354;
    int num = number;
    int sum = 0;
    while (number > 10) {
      sum += number % 10;
      number /= 10;
    }
    sum += number;
    System.out.println("Сумма числа " + num + " равна: " + sum);
  }
}
