package com.company.lesson7_9;

public class Lesson8 {
  public static void main(String[] args) {
    long number = 10L;
    long sum = 1L;
    for (int i = 1; i < number; i++) {
      sum *= i;
    }
    System.out.println("Факториал числа " + number + " равна: " + sum);
  }
}
