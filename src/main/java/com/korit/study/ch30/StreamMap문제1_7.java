package com.korit.study.ch30;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee1 {
    String name;
    double salary;

    public Employee1(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
class EmployeeDTO1 {
    String displayName;
    String salaryInfo;

    public EmployeeDTO1(String displayName, String salaryInfo) {
        this.displayName = displayName;
        this.salaryInfo = salaryInfo;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getSalaryInfo() {
        return salaryInfo;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "displayName='" + displayName + '\'' +
                ", salaryInfo='" + salaryInfo + '\'' +
                '}';
    }
}

public class StreamMap문제1_7 {
    public static void main(String[] args) {
        // 문제 7: 여러 필드를 조합한 새 객체 생성
        // class Employee {
        //     String name;
        //     double salary;
        //     // constructor, getters
        // }
        //
        // class EmployeeDTO {
        //     String displayName;
        //     String salaryInfo;
        //     // constructor, getters
        // }
        //
        // List<Employee> employees = Arrays.asList(
        //     new Employee("Kim", 50000),
        //     new Employee("Lee", 60000)
        // );
        // Employee를 EmployeeDTO로 변환하세요. displayName은 "Mr./Ms. {name}", salaryInfo는 "Salary: ${salary}"
        // 예상 출력:[EmployeeDTO(Mr./Ms. Kim, Salary: $50000.0), ...]

        List<Employee1> employees1 = Arrays.asList(
                new Employee1("Kim", 50000),
                new Employee1("Lee", 60000)
        );

        List<EmployeeDTO1> dtos = employees1.stream()
                .map(e -> new EmployeeDTO1(
                        "Mr./Ms " + e.getName(),
                        "Salary: $" + e.getSalary()
                ))
                .collect(Collectors.toList());

        System.out.println(dtos);
    }
}
