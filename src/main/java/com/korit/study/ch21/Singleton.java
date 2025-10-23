package com.korit.study.ch21;

import java.util.Objects;

public class Singleton {
    private volatile static Singleton instance;

    private String data;
//싱글톤은 한번만 생성해서 공유하고싶을 때 쓰는것 그렇기 때문에 무조건 private 으로 해야한다. 외부에서 생성이 안되도록
    private Singleton(String data) {
        this.data = data;
    }

    public static Singleton getInstance() {
        if (Objects.isNull(instance)) {
            instance = new Singleton("Class Data");
        }
        return instance;
    }

    public static Singleton getSynchronizedInstance() {
        if (Objects.isNull(instance)) {
            synchronized (Singleton.class) {
                if (Objects.isNull(instance)) {
                    instance = new Singleton("Class Data");
                }
            }
        }
        return instance;
    }

    public void changeData() {
        System.out.println("데이터 변경: " + data);
    }

    public void deleteData() {
        System.out.println("데이터 삭제: " + data);
    }
}
