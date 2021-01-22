package com.thg.accelerator.exercise.streams;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    static List<Employee> employees;

    public static void main(String[] args) throws IOException {
//instead of creating filereader and buffered reader and closing them - we can use files which does the same
//thing under the hood and saves a lot of lines of code. streaming each line and storing it as an object attribute
//for employeee. then adding all of these into the list of employees
        employees = Files.readAllLines(Path.of("data.txt"))
                .stream()
                .skip(1)
                .map(s -> s.split("\\|"))
                .map(employee -> new Employee(employee[0], employee[1], Integer.parseInt(employee[2])))
                .collect(Collectors.toList());

//       printSortedList(sortByFirstName());
//        printSortedList(sortByLastName());
        System.out.println(getSalarySumUsingParallelStream(sortByFirstName()));
        printSalaryUsingSequentialStream();
        printSalaryUsingParallelStream();

    }

    public static List<Employee> sortByFirstName() {
        return employees.stream()
                .sorted(Comparator.comparing(Employee::getFirstName))
                .collect(Collectors.toList());
    }

    public static List<Employee> sortByLastName() {
        return employees.stream()
                .sorted(Comparator.comparing(Employee::getLastName))
                .collect(Collectors.toList());
    }

    public static double getSalarySumUsingSequentialStream(List<Employee> employeesSortedByFirstName) {

        return employeesSortedByFirstName.stream()
                .filter(employee -> employee.getFirstName().toLowerCase().charAt(0) <= 'm')
                .mapToDouble(Employee::getSalary)
                .sum() * 1.1 +
                employeesSortedByFirstName.stream()
                        .filter(employee -> employee.getFirstName().toLowerCase().charAt(0) > 'm')
                        .mapToDouble(Employee::getSalary)
                        .sum();
    }

    public static double getSalarySumUsingParallelStream (List<Employee> employeesSortedByFirstName) {
        return employeesSortedByFirstName.parallelStream()
                .filter(employee -> employee.getFirstName().toLowerCase().charAt(0) <= 'm')
                .mapToDouble(Employee::getSalary)
                .sum() * 1.1 +
                employeesSortedByFirstName.parallelStream()
                        .filter(employee -> employee.getFirstName().toLowerCase().charAt(0) > 'm')
                        .mapToDouble(Employee::getSalary)
                        .sum();
    }


    public static void printSalaryUsingParallelStream() {
        long t1 = System.currentTimeMillis();
        getSalarySumUsingParallelStream(sortByFirstName());
        long t2 = System.currentTimeMillis();
        System.out.println("Parallel stream took: " + (t2 - t1) + " ms");
    }

    public static void printSalaryUsingSequentialStream() {
        long t1 = System.currentTimeMillis();
        getSalarySumUsingSequentialStream(sortByFirstName());
        long t2 = System.currentTimeMillis();
        System.out.println("Sequential stream took: " + (t2 - t1) + " ms");
    }

    public static void printSortedList(List<Employee> employees) {
        employees.forEach(System.out::println);
    }

}


