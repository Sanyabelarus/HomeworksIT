package com.company.lesson13_15;

public class Lesson15 {
  public static void main(String[] args) {
    int marks[] = new int[20];
    for (int i = 0; i < marks.length; i++) {
      marks[i] = (int) (Math.random() * 100 + 1);
      System.out.println(marks[i]);
    }
    int maxValue = marks[0];
    int maxNomber = 0;
    int minValue = marks[0];
    int minNomber = 0;
    for (int i = 0; i < marks.length; i++) {
      if (marks[i] > maxValue) {
        maxValue = marks[i];
        maxNomber = i;
      }
      if (marks[i] < minValue) {
        minValue = marks[i];
        minNomber = i;
      }
    }
    int sum = 0;
    if (maxNomber > minNomber) {
      for (int i = (minNomber + 1); i < maxNomber; i++) {
        sum += marks[i];
      }
    } else {
      for (int i = (maxNomber + 1); i < minNomber; i++) {
        sum += marks[i];
      }
    }
    System.out.println("Сумма ячеек = " + sum);
  }
}
