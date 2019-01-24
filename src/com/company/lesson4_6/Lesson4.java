package com.company.lesson4_6;

import java.util.Random;
import java.util.Scanner;

public class Lesson4 {
  public static void main(String[] args) {
    zakririe();
  }

  public static int isNumber() { // Проверка, являеться ли ввод числом
    boolean stop = false;
    while (!stop) {
      Scanner scanner = new Scanner(System.in);
      boolean rightNum = scanner.hasNextInt();
      if (rightNum) {
        stop = true;
        return scanner.nextInt();
      } else {
        System.out.println("Введите число");
        continue;
      }
    }
    return 0;
  }

  public static void zakririe() { // Основной метод
    Random random = new Random();
    int side1 = random.nextInt(100 + 1);
    System.out.println(side1);
    int side2 = random.nextInt(100 + 1);
    System.out.println(side2);
    int radius;
    System.out.println("Введите радиус круга");
    radius = isNumber();
    if (Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2)) <= radius * 2) {
      System.out.println("Круг закроет отверстие");
    } else {
      System.out.println("Круг не закроет отверстие");
    }
  }
}
