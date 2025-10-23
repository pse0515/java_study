package com.korit.study.ch22.dto;

class Entity {
    private String name;

    public void call() {
        Entity t = new Entity();
        t.name = "김준일";
        System.out.println(t.name);
    }

    public void thisCall() {
        System.out.println(name);
    }
}
// 메모리 접근이 아니라 객체 파일 안에서의 접근
// 동일한 클래스 안에서는 private 으로 되어있더라도 접근 가능
public class Test {
    public static void main(String[] args) {
        Entity e = new Entity();
        e.call();
        e.thisCall();
    }
}