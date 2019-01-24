package com.company.book2.lesson1_3.lesson1and6;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Store {
  public static boolean flag = true;

  public static final LogRegister LOG_REGISTER = LogRegister.getLogRegister();

  // Кассиры
  private static final String[] CASHIER = {"Светлана", "Виктория", "Тетя Маша", "Адольф", "Виктор"};
  // Кассы
  public static CashRegister[] cashRegisters = CashRegister.setCashRegisters(CASHIER);

  public static void main(String[] args) {

    Random random = new Random();

    ExecutorService poolForCashier = Executors.newFixedThreadPool(cashRegisters.length);

    for (CashRegister cr : cashRegisters) {
      poolForCashier.execute(cr);
    }

    ExecutorService poolForCustomers = Executors.newCachedThreadPool();

    // Добавляем покупателей
    for (int i = 0; i < 10; i++) {
      int numOfCastomers = random.nextInt(20);
      for (int j = 0; j < numOfCastomers; j++) {
        poolForCustomers.execute(new Customer());
      }
    }
    poolForCustomers.shutdown();

    // Проверяем есть ли ещё не обслуженные покупатнли и закрываем магазин
    while (true) {
      int i = 0;
      for (CashRegister cr : cashRegisters) {
        i += cr.getSizeOfQueue();
      }
      if (i == 0) {
        flag = false;
        break;
      } else {
        try {
          Thread.sleep(500);
        } catch (InterruptedException e) {
        }
      }
    }
    poolForCashier.shutdown();

    // Выводим и логируем итоговую информацию
    System.out.println("Path to LogFile: " + LogRegister.getPath() + "\n");

    for (CashRegister cr : cashRegisters) {
      String temp;
      StringBuilder result = new StringBuilder();
      try {
        temp = "Касса №: " + cr.getIdOfCashRegister();
        System.out.println(temp);
        result.append(temp + "\n");
        temp = "Кассир: " + cr.getCashier();
        System.out.println(temp);
        result.append(temp + "\n");
        temp = cr.getPathToReceipr();
        System.out.println(temp);
        result.append(temp + "\n");
        temp = "Обслужено клиентов " + cr.getNumberOfCustomersServed();
        System.out.println(temp);
        result.append(temp + "\n");
        temp = "Вся выручка " + cr.getMoney();
        System.out.println(temp);
        result.append(temp + "\n");
        LOG_REGISTER.aadInfo(result.toString());
        System.out.println("\n==============================\n");
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
