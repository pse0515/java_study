package com.korit.study.ch01;

import com.sun.jdi.DoubleValue;

import java.time.LocalTime;
import java.util.Date;

/**
 *
 */

public class Type {
    public static void main(String[] args) {
//        논리 자료형
        boolean open;
        open = true;
        System.out.println(open);
        open = false;
        System.out.println(open);

//      문자 자료형
        char lastName =  '김';
        System.out.println(lastName); // 문자 => 한글자이기 때문에 가능
//        char firstName = '준일'; // 한글자가 아니기 떄문에 에러

//        Ctrl + / : 한 줄 주석 , 주석은 왼쪽 정렬로 있는 것이 좋다.
//        Ctrl + Shift + /, /** Enter  : 여러 줄 주석
//        Ctrl + Space : 유지보수에 필요한 정보 남기기

//        문자열 자료형
        String firstName = "준일";
        System.out.println(firstName);

//        자바에서 파스칼 표기법 쓰는 곳 : 클래스밖에 없다

        String contents = "안녕하세요 \n김준일입니다.";  // 여러 줄 출력
        System.out.println(contents);
        String contents2 = """ 
                안녕하세요
                김준일입니다.
                """;
        System.out.println(contents2);

//      숫자
        double avg = 89.33;
        System.out.println(avg);
        int number = 10000000;
        System.out.println(number);
//        long nowTime = (int) new Date().getTime(); // 명시적 형 변환 -> 데이터 손실 . int 자료형이 long 보다 작아서 가능
        int nowTime = (int) new Date().getTime();
        System.out.println(nowTime);
        long longNumber = 22000000l;
        System.out.println(longNumber);

//      상수 (값이 바뀌면 안될 때 앞에 final) => 대문자
        final String uploadPath = "~/upload/image";
        final String UPLOAD_PATH =  "~/upload/image";



    }
}
