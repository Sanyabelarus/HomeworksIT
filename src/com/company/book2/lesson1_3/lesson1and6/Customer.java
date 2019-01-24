package com.company.book2.lesson1_3.lesson1and6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Customer extends Thread {
  private List<GoodsEmum> customerGoods = new ArrayList<>();

  public List<GoodsEmum> getCustomerGoods() {
    return customerGoods;
  }

  @Override
  public void run() {
    Random random = new Random();
    int goodsCount = random.nextInt(10) + 1;
    for (int i = 0; i < goodsCount; i++) {
      int temp = random.nextInt(Goods.GOODS.size());
      customerGoods.add(Goods.GOODS.get(temp));
    }
    CashRegister[] cashRegister = Store.cashRegisters;
    int min = cashRegister[0].getSizeOfQueue();
    int numberOfQueue = 0;
    for (int i = 0; i < cashRegister.length; i++) {
      int size = cashRegister[i].getSizeOfQueue();
      if (size == 0) {
        cashRegister[i].putCustomer(this);
        break;
      } else if (min > size) {
        min = size;
        numberOfQueue = i;
      }
    }
    cashRegister[numberOfQueue].putCustomer(this);
  }
}
