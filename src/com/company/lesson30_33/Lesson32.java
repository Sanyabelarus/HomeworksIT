package com.company.lesson30_33;

import java.io.*;

public class Lesson32 {
  public static void main(String[] args) throws Exception {
    DataOutputStream a;
    try {
      a = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("test.dat")));
      int mas[] = new int[19];
      for (int i = 0; i < 19; i++) {
        mas[i] = ((int) (Math.random() * 10));
        a.writeInt(mas[i]);
      }
    } catch (Exception e) {
      System.out.println("File not found");
      return;
    }
    a.close();
    DataInputStream dataInputStream = null;
    try {
      dataInputStream =
          new DataInputStream(new BufferedInputStream(new FileInputStream("test.dat")));
      System.out.printf("File size: %d bytes \n", dataInputStream.available());
      int res = dataInputStream.readInt();
      float x = 0;
      while (true) {
        System.out.print(res);
        try {
          x += res;
          res = dataInputStream.readInt();
        } catch (EOFException e) {
          break;
        }
      }
      System.out.println(" Среднее арифметическое: " + x / 20);
    } catch (FileNotFoundException e) {
      System.out.println("File not found");
      return;
    }
    dataInputStream.close();
  }
}
