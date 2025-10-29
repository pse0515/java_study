package com.korit.study.ch30;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// 문제 1: 문자열 첫 글자 추출
// List<String> cities = Arrays.asList("Seoul", "Busan", "Incheon", "Daegu", "Gwangju");
// 각 도시명의 첫 글자만 추출하여 문자 리스트를 생성하세요. 예상 출력:[S, B, I, D, G]
public class StreamMap문제2_1 {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Seoul", "Busan", "Inchon", "Daegu", "Gwangju");

        List<String> City2 = cities.stream()
                .map(city -> city.substring(0,1))
                .collect(Collectors.toList());

        System.out.println(City2);

    }
}
