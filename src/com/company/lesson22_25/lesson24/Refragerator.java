package com.company.lesson22_25.lesson24;

public class Refragerator implements ElectricalSettings {
  String refrageratorName;
  int collerPower;
  boolean isOn = false;

  @Override
  public void turnOn() {
    isOn = true;
    System.out.println("Refragerartor is on");
  }

  @Override
  public void turnOff() {
    isOn = false;
    System.out.println("Refragerartor is off");
  }

  public Refragerator(String refrageratorName, int collerPower) {
    this.refrageratorName = refrageratorName;
    this.collerPower = collerPower;
  }
}
