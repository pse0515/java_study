package com.korit.study.ch30;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap문제1_6 {
    public static void main(String[] args) {
        // 문제 6: 문자열 포맷팅
        // List<String> usernames = Arrays.asList("john", "mary", "steve");
        // 각 사용자명을 "User: {username}" 형식으로 변환하세요. 예상 출력:[User: john, User: mary, User: steve]

        List<String> usernames = Arrays.asList("john", "mary", "steve");
        List<String> formatted = usernames.stream()
                .map(name -> "user: " + name)
                .collect(Collectors.toList());
        System.out.println(formatted);

    }
}
