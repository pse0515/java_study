package com.korit.study.ch03;

import java.util.Scanner;

public class StudentinfoSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("학생 이름을 입력하세요: ");
        String name = scanner.next();
        System.out.print("나이를 입력하세요: ");
        int age = scanner.nextInt();
        System.out.print("학년을 입력하세요: ");
        int grade = scanner.nextInt();
        System.out.print("국어 점수를 입력하세요: ");
        double kor = scanner.nextDouble();
        System.out.print("영어 점수를 입력하세요: ");
        double eng = scanner.nextDouble();
        System.out.print("수학 점수를 입력하세요: ");
        double math = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("자기소개를 입력하세요: ");
        String introduce = scanner.nextLine();

        double average = (kor + eng + math) / 3;
        String totalScore = (average >= 90 ? "A" : average >= 80 ? "B" : average >= 70 ? "C" : "F" );



        //System.out.println("=== 학생정보 ===");
        //System.out.println("이름: " + name);
        //System.out.println("나이: " + age + "세 " + "(고등학교 " + grade +"학년)");
        //System.out.println("성적:");
        //System.out.println("   국어: " + kor + "점");
        //System.out.println("   영어: " + eng + "점");
        //System.out.println("   수학: " + math + "점");
        //System.out.println("   평균: " + average + "점" + "(학점: " + totalScore + ")");
        //System.out.println("자기소개: " + introduce);

        System.out.println("=== 학생정보 ===");
        System.out.println(String.format("""
                이름: %s
                나이: %d세
                성적:
                   국어: %.2f점
                   영어: %.2f점
                   수학: %.2f점
                   평균: %.2f점 (학점: %s)
                   자기소개: %s""", name, age, kor, eng, math, average, totalScore, introduce));




    }
}
