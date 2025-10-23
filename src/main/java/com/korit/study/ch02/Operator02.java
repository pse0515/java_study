package com.korit.study.ch02;

public class Operator02 {
    public static void main(String[] args) {
        int i = 0;
        System.out.println(i);
        i = i + 1;
        System.out.println(i);
        i += 1;
        System.out.println(i);
        ++i;
        System.out.println(i);
        i++;
        System.out.println(i);
        System.out.println(++i); // 명령이 끝나기 전에 1을 더한다
        System.out.println(i++); // 명령이 끝난 후에 1을 더한다
        System.out.println(i++ + 10);
        System.out.println(i);

    }
}
