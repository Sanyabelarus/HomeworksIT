package com.company.lesson22_25.lesson25;

import com.company.lesson22_25.lesson25.Visa.VisaClassic;
import com.company.lesson22_25.lesson25.Visa.VisaPlatinum;

public class Lesson25 {
  public static void main(String[] args) {
    VisaClassic visaClassic = new VisaClassic();
    VisaPlatinum visaPlatinum = new VisaPlatinum();
    System.out.println(visaClassic.getMaxMoney());
    System.out.println(visaPlatinum.getDicountAmount() + "%");
  }
}
