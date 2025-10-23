package com.korit.study.ch06;

//      2단계: 함수 오버로딩

public class 연습문제2 {
    public static void main(String[] args) {

        System.out.println(add(1, 2));
        System.out.println(add(1.0, 2.0));
        System.out.println(add(1, 2, 3));

        printInfo("김준일", 32, "부경대");
        printInfo("김준일", 32);
        printInfo("김준일");

    }

//    문제 2-1: 덧셈 함수 오버로딩

    // 정수 2개를 더하는 함수
    public static int add(int a, int b){
        return a + b;
    }

    // 실수 2개를 더하는 함수를 오버로딩으로 작성하세요
    public static double add (double a, double b){
        return a + b;
    }
    // 정수 3개를 더하는 함수를 오버로딩으로 작성하세요
    public static int add(int a, int b, int c){
        return a + b + c;
    }

//    문제 2-2: 정보 출력 함수 오버로딩
//      이름만 출력하는 함수
    public static void printInfo(String name){
        System.out.println("이름 : " + name);
    }

//      이름과 나이를 출력하는 함수를 오버로딩으로 작성하세요

    public static void printInfo(String name, int age){

        printInfo(name);
        System.out.println("나이 : " + age);
    }

//     이름, 나이, 학교를 출력하는 함수도 오버로딩으로 작성하세요
    public static void printInfo(String name, int age, String school){
        printInfo(name , age);
        System.out.println("학교 : " + school);
    }

}
