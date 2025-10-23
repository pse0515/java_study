package com.korit.study.ch07;

import java.util.Scanner;



public class ArrayListFunction {

    //     함수의 이름은 무조건 동사로, 변수의 이름은 명사로 쓰기
    public static void printNameAll(String[] names) {
        if (names.length == 0) {
            System.out.println("등록된 이름이 없습니다.");
        } else {
            for (int i = 0; i < names.length; i++) {
                System.out.println("이름 (" + i + ") : " + names[i]);
            }
        }
    }

    public static String[] addToArray(String value, String[] currentArray){
        String[] newArray = new String[currentArray.length + 1];
        for (int i = 0; i < currentArray.length; i++) {
            newArray[i] = currentArray[i];
        }
        newArray[newArray.length - 1] = value;  // 배열의 제일 끝 인덱스에 입력받은 이름 추가
        return newArray;

    }

    public static String inputName() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름 입력 : ");
        return scanner.nextLine();
    }

    public static String[] addInputNameToNames(String[] names){
        String name = inputName();
        return addToArray(name, names);

    }

    public static void main(String[] args) {
        String[] names = new String[0];

        printNameAll(names);
        names = addInputNameToNames(names);
        printNameAll(names);
        names = addInputNameToNames(names);
        printNameAll(names);
        names = addInputNameToNames(names);
        printNameAll(names);



    }

}