package com.company.lesson7_9;

import java.util.Random;

public class Lesson9 {
  public static void main(String[] args) {
    Random random = new Random();
    int[] array = new int[10];
    int x = 0;
    while (x < 10) {
      array[x] = random.nextInt(1000);
      x++;
    }
    int max = array[0];
    int y = 0;
    while (y < 10) {
      if (array[y] > max) {
        max = array[y];
      }
      y++;
    }
    System.out.println("Максимальное случайное число: " + max);
  }
}
