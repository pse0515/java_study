package com.korit.study.ch30;

// 문제 2: 불린 값 반전
// List<Boolean> flags = Arrays.asList(true, false, true, true, false);
// 각 불린 값을 반대로 변환하세요. 예상 출력:[false, true, false, false, true]

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap문제2_2 {
    public static void main(String[] args) {
        List<Boolean> flags = Arrays.asList(true, false, true, true, false);

        List<Boolean> flag2 = flags.stream()
                .map(flag -> !flag)
                .collect(Collectors.toList());
        System.out.println(flag2);
    }
}
