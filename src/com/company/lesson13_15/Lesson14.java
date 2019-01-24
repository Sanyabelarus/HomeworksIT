package com.company.lesson13_15;

public class Lesson14 {
  public static void main(String[] args) {
    int marks[] = new int[20];
    for (int i = 0; i < marks.length; i++) {
      marks[i] = (int) (Math.random() * 100 + 1);
    }
    for (int i = 0; i < marks.length; i++) {
      System.out.println("Ученик в " + i + " = " + marks[i]);
    }
    int maxValue = marks[0];
    int nomber = 0;
    for (int i = 0; i < marks.length; i++) {
      if (marks[i] > maxValue) {
        maxValue = marks[i];
        nomber = i;
      }
    }
    System.out.println("Cамая высокая оценка " + maxValue + " в " + nomber + " ячейке");
  }
}
