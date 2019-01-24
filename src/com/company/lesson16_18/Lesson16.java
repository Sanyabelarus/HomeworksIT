package com.company.lesson16_18;

public class Lesson16 {
  public static void main(String[] args) {
    int[] array = new int[10];
    for (int i = 0; i < array.length; i++) {
      array[i] = (int) (Math.random() * 100 + 1);
      System.out.print(array[i] + " ");
    }
    int temp = 0;
    System.out.println();
    for (int i = 0; i < array.length / 2; i++) {
      temp = array[i];
      array[i] = array[array.length - i - 1];
      array[array.length - i - 1] = temp;
    }
    for (int i : array) {
      System.out.print(i + " ");
    }
  }
}
