package com.company.lesson22_25.lesson24;

public class Lamps implements ElectricalSettings {
  String lampColor;
  int lightPower;
  boolean isOn = false;

  public Lamps(String lampColor, int lightPower) {
    this.lampColor = lampColor;
    this.lightPower = lightPower;
  }

  @Override
  public void turnOn() {
    isOn = true;
    System.out.println("Lamp is on");
  }

  @Override
  public void turnOff() {
    isOn = false;
    System.out.println("Lamp is off");
  }

  public String getLampColor() {
    return lampColor;
  }

  public int getLightPower() {
    return lightPower;
  }

  public boolean isOn() {
    return isOn;
  }
}
