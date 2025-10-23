package com.korit.study.ch02;

import javax.swing.*;
import java.util.TreeMap;

public class Operator03 {
    public static void main(String[] args) {

//      논리 연산자 => true , false
//      || =>  or 연산자 (합) : ~이거나, 둘 중 하나만 참. 더해서 1 이상의 결과가 나오면 True
        boolean b1 = false;
        boolean b2 = false;
        boolean b3 = b1 || b2;
        System.out.println(b3);
        b3 = b1 || true;
        System.out.println(b3);

//        && and 연산자 (곱 연산자)
        boolean b4 = b1 && b2;
        b4 = b1 && true; // 모든 조건이 참이여야지만 참인 것
        b4 = true && true;

//        ! not 연산자(부정)'
        boolean b5 = b2 && true;
        b5 = !b5;
        System.out.println(b5);
        System.out.println(!(true && true));


    }
}
