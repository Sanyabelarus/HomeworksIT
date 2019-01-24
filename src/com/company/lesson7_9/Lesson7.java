package com.company.lesson7_9;

public class Lesson7 {
    public static void main(String[] args) {
        int a = 500, b = 5, c = 15, d = 12500, e = 52, f = 20;
        int firstHouse = a * b;
        int secondHouse = c * d;
        int area = f * e;
        if((firstHouse+secondHouse)<=area){
            if (a <= f && b<=f && c<=f && d<=f){
                if(a<=e&&b<=e&&c<=f&&d<=f){
                    System.out.println("Помещаются");
                }
            }
        }else {
            System.out.println("Не помещаются");
        }
    }
}
