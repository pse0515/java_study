package com.korit.study.ch04;

public class Controller01 {
    public static void main(String[] args) {
        int num = 10;

        String text = num > 5 ? "5보다 큽니다." : "5이하입니다.";
        System.out.println(text);

        if (num > 5) {
            System.out.println("5보다 큽니다");
        } else {
            System.out.println("5이하 입니다.");
        }

        int score = 85;

        if (score > 50) System.out.println("50보다 큽니다."); //if문이 1개일때는 생략 가능, else도 마찬가지

        if (score >= 95) {
            System.out.println("A+");
        } else if (score >= 90) {
            System.out.println("A");
        } else if (score >= 85) {
            System.out.println("B+");
        } else {
            System.out.println("B");
        }

    }
}