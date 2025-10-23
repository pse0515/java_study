package com.korit.study.ch23;

import java.util.ArrayList;

public class CollectionMain {
    public static void main(String[] args) {
        // Object 가 생략 되어 있다 자료형 상관없이 다 담기면 오브젝트다
        ArrayList list = new ArrayList();
        list.add(10);
        list.add("20");
        list.add(30.5);
        list.add(true);
        System.out.println(list);
        System.out.println(list.get(0));
        ArrayList<String> strList = new ArrayList<>();
        strList.add("문자열");
        System.out.println(strList.get(0));
        // String[] 이렇게 한것과 동일하다
    }

    public static void test(ArrayList<String> strList) {

    }
}
