package com.company.lesson19_21;

public class Lesson20 {
  public static void main(String[] args) {
    String string =
        "Что вы, травки малые, травки захудалые,  \n"
            + "Вышли вдоль дороженьки под обод, под ноженьки?  \n"
            + "Капельки блестевшие, в ливне прошумевшие,  \n"
            + "Что поторопилися — в озеро пролилися?  \n"
            + "Что ты, сердце честное, миру неизвестное,  \n"
            + "Бьешься не по времени, не в роде, не в племени?  ";
    string.trim();
    string = string.replace('—', ' ');
    string = string.replace(',', ' ');
    string = string.replace('.', ' ');
    string = string.replace('?', ' ');
    System.out.println(string);
    String[] strings1 = string.split("\\s+");
    for (int i = 0; i < strings1.length; i++) {
      System.out.print(strings1[i].charAt(strings1[i].length() - 1));
    }
  }
}
