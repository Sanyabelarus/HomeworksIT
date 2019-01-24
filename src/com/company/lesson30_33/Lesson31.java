package com.company.lesson30_33;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Lesson31 {
  public static void main(String[] args) {
    FileWriter fileWriter = null;
    try {
      fileWriter = new FileWriter("text.txt");
      fileWriter.write(
          "Пределах добра34 и демонстрации внешнего вида контента, просмотра шрифтов, абзацев, отступов. "
              + "Именно из его трактата о пределах добра. Оценке 4качества восприятия макета который планируется использовать в."
              + " Интернет-страницы и т.д внешнего вида контента, просмотра шрифтов, абзацев34, отступов и. "
              + "Или иные буквы23 встречаются с разной частотой, имеется разница. "
              + "Древнеримскому философу цицерону, ведь именно из его трактата. Цель применения34 такого текста сыграет.");

    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        fileWriter.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    FileReader fileReader = null;
    try {
      fileReader = new FileReader("text.txt");
      BufferedReader reader = new BufferedReader(fileReader);
      String string = reader.readLine();
      String number = string.replaceAll("[^0-9]", "");
      System.out.println(number);
      int x = Integer.parseInt(number);
      int sum = 0;
      while (x != 0) {
        sum += x % 10;
        x /= 10;
      }
      System.out.println(sum);
      Set<String> nums = new HashSet<>();
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(number);
      for (int i = 0; i < stringBuilder.length(); i++) {
        String s = String.valueOf(stringBuilder.charAt(i));
        nums.add(s);
      }
      System.out.println(nums);
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        fileReader.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
