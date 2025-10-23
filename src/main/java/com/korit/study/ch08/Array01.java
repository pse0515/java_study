package com.korit.study.ch08;

import java.util.Random;
import java.util.Scanner;

public class Array01 {
    public static void main(String[] args) {
        // 배열의 가장 큰 목적은 묶어 놓고 반복을 통해 순서대로 데이터를 사용하려고
        int[] a = new int[3];
        double[] b = new double[3];
        boolean[] c = new boolean[3];
        String[] d = new String[3];
        Scanner[] e = new Scanner[3];
        Random[] f = new Random[3];

        int a2 = 10;
        double b2 = 10.5;
        boolean c2 = true;
        String d2 = "";
        Scanner e2 = new Scanner(System.in);
        Random f2 = new Random();

        // 배열은 참조타입으로, 실제 데이터는 힙 메모리에 저장된다.
        // 배열 변수는 배열 객체의 참조(주소)만 가진다.
        // 배열 크기는 생성 시점에 결정되며 이후 변경 불가능
        // 초기화하지 않은 요소는 타입별 기본값으로 채워진다.


        System.out.println(c[0]);




    }
}
