package com.company.lesson22_25.lesson25.Visa;

public class VisaPlatinum extends VisaGold {
  public VisaPlatinum() {
    this.topServise = true;
    this.dicountAmount = 15;
    this.maxMoney = 200000;
    this.maxWindraw = 20000;
    this.internetTransitions = true;
    this.foreignTransitions = true;
  }
}
