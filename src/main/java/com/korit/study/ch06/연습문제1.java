package com.korit.study.ch06;
import java.util.Date;

public class 연습문제1 {

    public static void main(String[] args) {

        hello();
        hello("문서현");
        square(3);
//        System.out.println(now.getHours()); // 날짜 및 시간
//        System.out.println(now); // 시간
//        System.out.println(now.getMinutes()); // 분

        System.out.println(isNowTime(11, 42));

    }
//  문제 1-1: 인사 함수
//  매개변수 없음, 리턴값 없음
// "안녕하세요!"를 출력하는 함수를 작성하세요

    public static void hello(){

        System.out.println("안녕하세요");
    }

//  문제 1-2: 이름 인사 함수
// 매개변수 있음, 리턴값 없음
// 이름을 받아서 "안녕하세요, [이름]님!"을 출력하는 함수를 작성하세요
    static void hello(String name){
        System.out.println("안녕하세요 " + name +" 님 !");
    }

//    문제 1-3: 숫자 제곱 함수
// 매개변수 있음, 리턴값 있음
// 정수를 받아서 제곱값을 반환하는 함수를 작성하세요
    public static int square(int number){
        return number * number;
    }

//  문제 1-4: 현재 시간 함수
// 매개변수 없음, 리턴값 있음
// 현재 시간을 "현재 시간입니다"라는 문자열로 반환하는 함수를 작성하세요
    public static String isNowTime(int hours, int minutes){
        Date now = new Date();
        int nowHours = now.getHours();
        int nowMinutes = now.getMinutes();
        return ((hours == nowHours) && (minutes == nowMinutes) ? "현재 시간입니다." : "현재 시간이 아닙니다");
    }

}
