package com.korit.study.ch02;

import java.util.TreeMap;

public class Operator04 {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        boolean c = a > b;
        boolean d = a < b;
        boolean e = a >= b;
        boolean f = a <= b;
        boolean g = a == b; // 같다
        boolean h = a != b; // 다르다
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);

        int n = 20;
        boolean r = (5 <= n) && (n <= 15); // 5 ~ 15 사이면 n의 값이 true;
        System.out.println(r);

        a = 10;
        b = 10;
        System.out.println("a" == "a");
        System.out.println("a".equals("a"));
        System.out.println(true == true);
        System.out.println(false == false);
        System.out.println('a' == 'a');

//        문제 1
//        int 키 = 170;
//        int 몸무게 = 65;
////      double BMI = ;     // 키에서 100을 나눈 결과의 제곱을 몸무게에서 나눈 결과
//
//        double height = (double) 170 / 100 ;
//        double height2 = height * height;
//        double BMI = (double) 65 / height2;
//
//        boolean 저체중 = BMI < 18.5;      // 18.5 미만
//        boolean 정상 = (18.5 <= BMI && BMI < 24.9);      // 18.5에서 24.9사이
//        boolean 과체중 = (25 <= BMI  && BMI < 29);      // 25에서 29.9 사이
//        boolean 비만 = BMI >= 30;      // 30 이상
//
//        System.out.println("height : " + height);
//        System.out.println("height2 : " + height2);
//        System.out.println("BMI : " + BMI);
//        System.out.println("저체중 : " + 저체중);
//        System.out.println("정상 : " + 정상);
//        System.out.println("과체중 : " + 과체중);
//        System.out.println("비만 : " + 비만);


//solve
        int 키 = 170;
        int 몸무게 = 65;
        System.out.println((double) 키 / 100); // double로 업캐스팅-> 나누기 연산보다 캐스팅이 먼저 일어난다.
//        System.out.println(키 / 100.0); // 또는 100을 double형으로 바꿔주기
        System.out.println( 몸무게 / ((키 / 100.0) * (키/ 100.0)));
        double BMI =  몸무게 / ((키 / 100.0) * (키/ 100.0));  // 키에서 100을 나눈 결과의 제곱을 몸무게에서 나눈 결과

//        항상 기준 데이터는 오른쪽, 변수 데이터는 왼쪽
//        정수끼리면 초과, 미만 사용 , 소수점 단위는 "포함"시키기
        boolean 저체중 = BMI < 18.5;      // 18.5 미만
        boolean 정상 = ( BMI > 18.5 && BMI < 24.9);      // 18.5에서 24.9사이
        boolean 과체중 = (BMI >= 25 && BMI < 29.9);      // 25에서 29.9 사이
        boolean 비만 = BMI >= 30;      // 30 이상

        System.out.println("BMI : " + BMI);
        System.out.println("저체중 : " + 저체중);
        System.out.println("정상 : " + 정상);
        System.out.println("과체중 : " + 과체중);
        System.out.println("비만 : " + 비만);

//      문제 2

//        급여 계산 ( 근로기준법 총근로시간 40시간, 나머지는 시간 외 근무시간)

//        int 기본급 = 2400000;
//        int 근무시간 = 52 * 4;
//        int 시간수당 = 2400000 / (40*4);
////        System.out.println("시간수당 : "+ 시간수당);
//        int 총급여 = 2400000 +((int)((52 - 40) * 4 * 1.5 * 시간수당)) ; // 기본급 + (시간외 수당 * 1.5배)
//        int 세금 = (int)(총급여 * 0.1); // 총급여의 10%
//        int 지급급여 = 총급여 - 세금; // 총급여 - 세금
//
//        System.out.println("총 급여 : " + 총급여);
//        System.out.println("세금 : " + 세금);
//        System.out.println("지급급여 : " + 지급급여);


//        sol

        int 기본급 = 2400000;
        int 근무시간 = 52 * 4;
        int 시급 = 2400000 / 160;
        System.out.println(시급);
        int 시간외수당 = (int) (시급 * 1.5 * 48);
        int 총급여 = 기본급 + 시간외수당; // 기본급 + (시간외 수당 * 1.5배)
        System.out.println(총급여);
        int 세금 = (int)(총급여 * 0.1); // 총급여의 10%
        int 지급급여 = 총급여 - 세금; // 총급여 - 세금
        System.out.println("총 급여 : " + 총급여);
        System.out.println("세금 : " + 세금);
        System.out.println("지급급여 : " + 지급급여);



    }
}
