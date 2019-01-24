package com.company.lesson10_12;

public class Lesson12 {
  public static void main(String[] args) {
    long num = 5243412312123L;
    StringBuffer count = new StringBuffer();
    count.append(num);
    count.reverse();
    System.out.println(count);
    for (int i = 0; i < count.length(); i++) {
      if (i % 4 == 0) {
        count.insert(i, " ");
      }
    }
    System.out.println(count.reverse());
  }
}
