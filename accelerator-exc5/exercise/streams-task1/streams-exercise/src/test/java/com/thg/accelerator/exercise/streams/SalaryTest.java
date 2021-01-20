//package com.thg.accelerator.exercise.streams;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import java.util.Arrays;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class SalaryTest {
//
//    List<Employee> employeeList;
//
//    @BeforeEach
//    void setUp() {
//
//        Employee john = new Employee("John", "Doe", 20000.0);
//        Employee foo = new Employee("Foo", "Who", 10000.0);
//        Employee loo = new Employee("Loo", "Too", 30000.0);
//
//        employeeList = Arrays.asList(john, foo, loo);
//
//
//    }
//
//    @Test
//    void getSalary() {
//
//        Main.getSalarySum(employeeList);
//    }
//}