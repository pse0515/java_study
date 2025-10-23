package com.korit.study.ch04;

public class Controller04 {
    public static void main(String[] args) {

        for (int i = 3; i < 100; i++) {
            if (i % 4 == 0) {
                System.out.println(i);
            }
        }

        // for (int i = 0; i < 20; i++) {
        //      int n = i + 1;
        //System.out.printf("%,d = %s\n",n , n%2 == 0 ? "짝" : "홀");


        //if (n % 2 == 0) {
        //  system.out,println(n + " = 짝");
        // else {
        //  system.out,println(n + " = 홀");


        // if (n % 2 == 0) {
        //  system.out.println(n + " = 짝"
        //  continue;
        //  system.out.println(n + " = 홀"

        for (int i = 0; i < 21; i++) {
            if (i % 2 == 1) {
                System.out.println(i +" = 홀");
            }
            else if (i % 2 == 0) {
                if (i != 0){
                    System.out.println(i +" = 짝");
                }

            }
        }



//        int i = 0;
//        while (i < 5) {
//            System.out.println(i);
//            i++;
//
//        }
    }
}
