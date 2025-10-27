package com.korit.study.ch29;

interface LambdaStudy {
    int calc(int a, int b, int c);
}

public class LambdaMain {
    public static void main(String[] args) {
        LambdaStudy s1 = new LambdaStudy() {
            @Override
            public int calc(int a, int b, int c) {
                System.out.println("익명클래스 사용");
                return a * b - c;
            }
        };
        System.out.println(s1.calc(10, 5, 2));
/////////////////////////////////////////////////////////
        LambdaStudy s2 = (a, b, c) -> {
            System.out.println("람다 사용");
            return a * b - c;
        };
        System.out.println(s2.calc(10, 5, 2));
    }
}
