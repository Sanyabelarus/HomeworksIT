package com.company.book2.lesson1_3.lesson1and6;

import java.io.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.concurrent.LinkedBlockingQueue;

public class CashRegister extends Thread {
  private BigDecimal money = new BigDecimal("0");
  private String cashier;
  private static int count;
  private final int id = ++count;
  private int numberOfCustomersServed;
  private LinkedBlockingQueue<Customer> queue = new LinkedBlockingQueue<>();
  private File check;

  public CashRegister(String cashier) { // Чеки

    check = new File(".\\register#" + id + ".txt");

    try {
      check.createNewFile();
    } catch (IOException e) {

      Store.LOG_REGISTER.aadInfo("Кассир# " + id + " не создан \n");
      Store.LOG_REGISTER.aadInfo(LogRegister.ExceptionToString(e));
      return;
    }
    this.cashier = cashier;
  }

  public int getNumberOfCustomersServed() {
    return numberOfCustomersServed;
  }

  public String getPathToReceipr() throws IOException {
    return check.getCanonicalPath();
  }

  public BigDecimal getMoney() {
    return money;
  }

  public void setMoney(BigDecimal money) {
    this.money = money;
  }

  public String getCashier() {
    return cashier;
  }

  public int getIdOfCashRegister() {
    return id;
  }

  public void putCustomer(Customer customer) {
    try {
      queue.put(customer);
    } catch (InterruptedException e) {
      Store.LOG_REGISTER.aadInfo("Покупатель не может стать в очередь #" + id + "\n");
      Store.LOG_REGISTER.aadInfo(LogRegister.ExceptionToString(e));
    }
  }

  public synchronized int getSizeOfQueue() {
    return queue.size();
  }

  public static CashRegister[] setCashRegisters(String[] cashiers) {
    CashRegister[] cashRegisters = new CashRegister[cashiers.length];
    for (int i = 0; i < cashiers.length; i++) {
      cashRegisters[i] = new CashRegister(cashiers[i]);
    }
    return cashRegisters;
  }

  @Override
  public void run() {
    while (Store.flag) {
      if (queue.isEmpty()) {
        yield();
      } else {
        Customer customer = queue.poll();
        numberOfCustomersServed++;
        money = money.add(writeCheck(customer));
      }
    }
  }

  private BigDecimal writeCheck(Customer customer) {
    BigDecimal sum = new BigDecimal("0");
    try (PrintWriter printWriter =
        new PrintWriter(new BufferedOutputStream(new FileOutputStream(check, true)))) {

      printWriter.println("Кассир: " + cashier + "\n----------------\nКассир №" + id + "\n");
      for (GoodsEmum goods : customer.getCustomerGoods()) {
        printWriter.println(goods);
        sum = sum.add(goods.getPrise());
      }
      printWriter.println("Всего: " + sum);
      printWriter.println(LocalDateTime.now());
      printWriter.println("\n=============================================\n");

    } catch (FileNotFoundException e) {
      Store.LOG_REGISTER.aadInfo("Не могу сохранить чек");
      Store.LOG_REGISTER.aadInfo(LogRegister.ExceptionToString(e));
    }
    return sum;
  }
}
