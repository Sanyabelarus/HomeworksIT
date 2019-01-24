package com.company.lesson22_25;

public class Lesson22 {
  public static void main(String[] args) {
    Time time = new Time(23423);
    Time time1 = new Time(2312);
    System.out.println(time.compareTo(time1.getSec()));
  }

  static class Time {
    public int hour;
    public int min;
    public int sec;

    public Time(int s) {
      int m;
      int h;
      this.sec = s % 60;
      m = (s - sec) / 60;
      this.min = m % 60;
      h = (m - min) / 60;
      this.hour = h % 24;
    }

    public Time(int hour, int min, int sec) {
      this.hour = hour;
      this.min = min;
      this.sec = sec;
    }

    public int getSec() {
      return (((hour * 60) + min) * 60) + sec;
    }
    public int compareTo(int num1) {
      if (num1 == getSec()) {
        return 0;
      } else if (num1 > getSec()) {
        return 1;
      } else return -1;
    }
  }
}
