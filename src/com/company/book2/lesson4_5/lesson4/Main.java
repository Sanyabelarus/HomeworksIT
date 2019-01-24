package com.company.book2.lesson4_5.lesson4;
/*
 * Задание 4. Написать код выводящий число 153.5 в денежном виде для Украины
 */
import java.text.NumberFormat;
import java.util.Locale;

public class Main {
  public static void main(String[] args) {
    NumberFormat ukraine = NumberFormat.getCurrencyInstance(new Locale("uk", "UA"));

    System.out.println(ukraine.format(153.5));
  }
}
