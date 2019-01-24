package com.company.book2.lesson1_3.lesson2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
  public static void main(String[] args) {
    String line = "0x8A AsagfsD 0x97699779 sdfdjdgf 0xDA dfhgfh fdgfdg664643 fdsf ";
    Pattern pattern16 = Pattern.compile("x[0-9A-F]+");
    Matcher matcher = pattern16.matcher(line);

    while (matcher.find()) {
      System.out.println(matcher.group());
    }
  }
}
