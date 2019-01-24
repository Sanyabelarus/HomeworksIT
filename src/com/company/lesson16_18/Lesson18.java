package com.company.lesson16_18;

public class Lesson18 {
  public static void main(String[] args) {
    char[] c = {'.', ',', '-', ':', ';', '?', '!'};
    int count = 0;
    String string =
        "Что вы, травки малые, травки захудалые,  \n"
            + "Вышли вдоль дороженьки под обод, под ноженьки?  \n"
            + "Капельки блестевшие, в ливне прошумевшие,  \n"
            + "Что поторопилися — в озеро пролилися?  \n"
            + "Что ты, сердце честное, миру неизвестное,  \n"
            + "Бьешься не по времени, не в роде, не в племени?  ";
    for (int i = 0; i < string.length(); i++) {
      for (int j = 0; j < c.length; j++) {
        if (string.charAt(i) == c[j]) {
          count++;
          break;
        }
      }
    }
    System.out.println(count);
  }
}
