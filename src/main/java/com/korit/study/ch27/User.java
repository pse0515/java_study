package com.korit.study.ch27;

public class User {
    private String name;
    private String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public class UserPrinter {
        private String printValue;

        public UserPrinter(String printValue) {
            this.printValue = printValue;
        }

        public void print() {
            System.out.println(printValue);
        }

    }

    public static class UserPrinter2 {
        private String printValue;

        public UserPrinter2(String printValue) {
            this.printValue = printValue;
        }

        public void print() {
            System.out.println(printValue);
        }
    }
}
