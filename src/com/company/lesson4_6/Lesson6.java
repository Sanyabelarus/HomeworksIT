package com.company.lesson4_6;

public class Lesson6 {
    public static void main(String[] args) {
        int y = 2001;
        int m = 2;
        int d = 28;

        {
            if (d == 31 && m == 12)
                System.out.println("Сегоня новый год а завтра 01.01."+ ++y);
            else {
                if ((d == 31 && (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10)) || (d == 30 && (m == 4 || m == 6 || m == 9 || m == 11)) || (d == 29 && m == 2 && y % 4 == 0) || (d == 28 && m == 2 && y % 4 != 0))
                    System.out.println("Сегодня " + d + "." + m + "." + y + "\nЗавтра 01." + (m + 1) + "." + y);
                else {
                    System.out.println("Сегодня " + d + "." + m + "." + y + "\nЗавтра " + (d + 1) + "." + m + "." + y);
                }
            }


        }
    }
}
