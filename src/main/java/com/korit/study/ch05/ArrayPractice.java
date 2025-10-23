package com.korit.study.ch05;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};

        for (int i = 0; i < 5; i++) {
            System.out.println(nums [i]);
        }

        System.out.println("----------------2번-----------------");


        int[] num = {5, 10, 15, 20, 25};
        int total = 0;

        for (int i = 0; i < 5; i++) {
            total = total + num[i];


        }
        System.out.println("배열 요소들의 합: " + total);

        System.out.println("---------------3번---------------");


        int[] num2 = {23, 45, 12, 67, 34, 89, 11};
        int max = 0;

        for (int i = 0; i < 6; i++) {
            if (num2[i] < num2[i + 1]) {
                max = num2[i + 1];
            }
        }
        System.out.println("배열의 최댓값: " + max);



        System.out.println("---------------4번---------------");

        int[] num3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.print("짝수:");

        for (int i = 0; i < 10; i++) {
            if (num3[i] %2 == 0){
                System.out.print(" " + num3[i]);
            }
        }

        int[] evens = new int[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0){
                int[] temp = new int[evens.length + 1];
                for (int j = 0; j < evens.length; j++) {
                    temp[j] = evens[j];
                }
                evens = temp;
                evens[evens.length - 1] = nums[i];
            }
        }
        System.out.println();
        System.out.println("---------------5번---------------");


        int[] num4 = {1, 2, 3, 4, 5};
        int a = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print(5 - i);

        }
        System.out.println();
        System.out.println("---------------6번---------------");


        int[] num5 = {3, 7, 3, 9, 3, 1, 3, 5};
        int b = 0;

        for (int i = 0; i < 8; i++) {

        }




    }


}
