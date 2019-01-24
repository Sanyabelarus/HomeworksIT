package com.company.book2.lesson1_3.lesson1and6;

import java.math.BigDecimal;

public enum GoodsEmum {
  BREAD("0.95"),
  MILK("1.75"),
  ORANGE("3"),
  POTATO("0.8"),
  ICECREAM("1.15");

  private BigDecimal prise;

  GoodsEmum(String prise) {
    this.prise = new BigDecimal(prise);
  }

  public BigDecimal getPrise() {
    return prise;
  }

  @Override
  public String toString() {
    return super.toString() + "......" + prise.toString();
  }
}
