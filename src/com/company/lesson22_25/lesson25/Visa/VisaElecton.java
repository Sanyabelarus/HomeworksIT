package com.company.lesson22_25.lesson25.Visa;

public class VisaElecton {
  protected int maxMoney;
  protected int maxWindraw;
  protected boolean internetTransitions;
  protected boolean foreignTransitions;

  public VisaElecton() {
    this.maxMoney = 5000;
    this.maxWindraw = 200;
    this.internetTransitions = false;
    this.foreignTransitions = false;
  }

  public int getMaxMoney() {
    return maxMoney;
  }

  public int getMaxWindraw() {
    return maxWindraw;
  }

  public boolean isInternetTransitions() {
    return internetTransitions;
  }

  public boolean isForeignTransitions() {
    return foreignTransitions;
  }
}
