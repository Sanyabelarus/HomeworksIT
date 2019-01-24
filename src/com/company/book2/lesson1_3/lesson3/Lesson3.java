package com.company.book2.lesson1_3.lesson3;

public class Lesson3 {
  public static void main(String[] args) {
    String line =
        "<p class=\"style1\"></p>\n"
            + "<p id=\"id_style1\"></p>\n"
            + "<p class=\"style1\" id=\"id_style1\"></p>";

    System.out.println(line.replaceAll("<p .*?>", "<p>"));
  }
}
