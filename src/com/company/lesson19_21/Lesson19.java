package com.company.lesson19_21;

public class Lesson19 {
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
    System.out.println(string.split(" +").length);
  }
}
