package com.korit.study.ch02;

public class Operator01 {
    public static void main(String[] args) {
//       산술연산
        int n1 = 10;
        int n2 = 5;

        int r1 = n1 + n2;
        System.out.println(r1);


//        문자열 더하기
        String text1 = "문자열";
        String text2 = "고치기";
        String text3 = text1 + text2;
        System.out.println(text3);
        System.out.println("문자열2" + "        " + "합치기2" + text1 + "     " + r1);

//      연산으로 인한 캐스팅
        double n3 = 2.1;
        int n4 = 10;
        System.out.println(n3 + n4);
        String n5 = "" + 2.1;
        double n6 = 10.12;
        double n7 = Double.parseDouble(n5) + n6; // 문자열 + double = 문자열
        System.out.println(n7);
        System.out.println(10 + 'a'); // 자료형이 큰 int 자료형을 따라가기 떄문에 값이 int로 나온다
        System.out.println((char) ('a' + 10)); // 문자향으로 변환
        System.out.println("" + 'a' +'b'); // "" + 'a'의 결과에 b를 더한다 -> 문자열 + 문자열 => 문자열
        System.out.println("" + 'a' +'b'); // 'a' + 'b'의 결과에 ""를 더한다 -> 숫자 + 숫자 = 숫자
        System.out.println('a' + ('b' + ""));

        int n8 = 10;
        int n9 = 4;
        int n10 = n8 % n9 ; // % : 나머지 연산자.
        System.out.println(n10);
    }
}


