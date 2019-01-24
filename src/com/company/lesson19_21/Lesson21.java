package com.company.lesson19_21;

public class Lesson21 {
  public static void main(String[] args) {
    System.out.println(
        "время исполнения: " + getTime(() -> checkString()) / 1_000_000 + " милисекунд");
    System.out.println(
        "время исполнения: " + getTime(() -> checkStringBuilder()) / 1_000_000 + " милисекунд");
  }

  private static void checkString() {
    String str = "";
    for (int i = 0; i < 255; i++) {
      str += (char) i;
    }
  }

  private static void checkStringBuilder() {
    StringBuilder strB = new StringBuilder();
    for (int i = 0; i < 255; i++) {
      strB.append((char) i);
    }
  }

  private static long getTime(Runnable runnable) {
    long begin;

    begin = System.nanoTime();
    for (int i = 0; i < 100000; i++) {
      runnable.run();
    }

    return System.nanoTime() - begin;
  }
}
