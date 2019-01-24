package com.company.lesson22_25.lesson25.Visa;

public class VisaGold extends VisaClassic {
  boolean topServise;
  int dicountAmount;

  public VisaGold() {
    this.topServise = false;
    this.dicountAmount = 5;
    this.maxMoney = 70000;
    this.maxWindraw = 7000;
    this.internetTransitions = true;
    this.foreignTransitions = true;
  }

  public boolean isTopServise() {
    return topServise;
  }

  public int getDicountAmount() {
    return dicountAmount;
  }
}
