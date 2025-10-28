package com.korit.study.ch30;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class StreamMap문제5 {
        public static void main(String[] args) {
        // 문제 5: 객체에서 특정 필드 추출
        // lass Person {
        //     private String name;
        //     private int age;
        //     // constructor, getters
        // }
        //
        // List<Person> people = Arrays.asList(
        //     new Person("Alice", 25),
        //     new Person("Bob", 30),
        //     new Person("Charlie", 35)
        // );
        // Person 객체 리스트에서 이름만 추출하여 문자열 리스트를 생성하세요. 예상 출력:[Alice, Bob, Charlie]

            List<Person> people = Arrays.asList(
                    new Person("Alice", 25),
                    new Person("Bob", 30),
                    new Person("Charlie", 35)
            );

            List<String> name = people.stream()
                    .map(person -> person.getName())
                    .collect(Collectors.toList());
            System.out.println(name);


    }
}
