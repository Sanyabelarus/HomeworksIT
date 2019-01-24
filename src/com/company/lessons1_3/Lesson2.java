package com.company.lessons1_3;

public class Lesson2 {
    public static void main(String[] args) {
        int s = 370000;
        int sec;
        int m;
        int min, h, hour;
        int d;
        int day, week;
        sec = s % 60;
        m = (s - sec) / 60;
        min = m % 60;
        h = (m - min) / 60;
        hour = h % 24;
        d = (h - hour) / 24;
        day = d % 7;
        week = (d - day) / 7;
        System.out.println(week + " недель " + day + " дней " + hour + " часов " + min + " минут " + sec + " секунд");
    }
}
