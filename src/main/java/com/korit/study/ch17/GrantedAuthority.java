package com.korit.study.ch17;

public interface GrantedAuthority {

    //인터페이스는 기본적으로 public 을 포함하고 있다. 생략가능한것이기 때문에 public을 적어놔도 됨
    public String getAuthority();

}
