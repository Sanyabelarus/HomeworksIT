package com.company.lesson30_33;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson30 {
  public static void main(String[] args) {
    FileWriter fileWriter = null;
    try {
      fileWriter = new FileWriter("text.txt");
      fileWriter.write(
          "Пределах добра и демонстрации внешнего вида контента, просмотра шрифтов, абзацев, отступов. "
              + "Именно из его трактата о пределах добра. Оценке качества восприятия макета который планируется использовать в."
              + " Интернет-страницы и т.д внешнего вида контента, просмотра шрифтов, абзацев, отступов и. "
              + "Или иные буквы встречаются с разной частотой, имеется разница. "
              + "Древнеримскому философу цицерону, ведь именно из его трактата. Цель применения такого текста сыграет.");

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
      Pattern pattern = Pattern.compile("[!.,;:?\\-]");
      Matcher matcher = pattern.matcher(string);
      int count = 0;
      while (matcher.find()) {
        count++;
      }
      System.out.println(count);
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
