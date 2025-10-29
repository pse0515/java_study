package com.korit.study.ch30;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap문제1_1_4 {

    public static void main(String[] args) {
        // 문제 1: 문자열 대문자 변환
        // List<String> names = Arrays.asList("alice", "bob", "charlie", "david");
        //모든 이름을 대문자로 변환하여 새로운 리스트를 생성하세요. 예상 출력: [ALICE, BOB, CHARLIE, DAVID]

        List<String> names = Arrays.asList("alice", "bob", "charlie", "david");
        List<String> names2 = names.stream()
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(names2);

        // 메서드 참조
        List<String> names3 = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(names3);


        /// //////////////////////////////////////////////

        // 문제 2: 숫자 제곱 계산
        // List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        // 각 숫자의 제곱을 계산하여 새로운 리스트를 생성하세요. 예상 출력: [1, 4, 9, 16, 25]

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> numbers2 = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println(numbers2);


        /// ///////////////////////////////////////////////////

        // 문제 3: 문자열 길이 추출
        // List<String> words = Arrays.asList("Java", "Stream", "API", "Programming");
        // 각 단어의 길이를 추출하여 정수 리스트를 생성하세요. 예상 출력: [4, 6, 3, 11]

        List<String> words = Arrays.asList("java", "Stream", "API", "Programming");
        List<Integer> words2 = words.stream()
                .map(word -> word.length())
                .collect(Collectors.toList());
        System.out.println(words2);

        //메서드 참조
        List<Integer> words3 = words.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(words3);

        /// //////////////////////////////////////////////////////

        // 문제 4: 가격에 세금 추가
        // List<Double> prices = Arrays.asList(100.0, 200.0, 150.0, 300.0);
        // 각 가격에 10% 세금을 추가한 최종 가격 리스트를 생성하세요. 예상 출력:[110.0, 220.0, 165.0, 330.0]

        List<Double> prices = Arrays.asList(100.0, 200.0, 150.0, 300.0);
        List<Double> prices2 = prices.stream()
                .map(price -> price * 1.1)
                .collect(Collectors.toList());
        System.out.println(prices2);


    }
}
