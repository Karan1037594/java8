package com.java.lambda.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamListSorting {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");

        List<String> sortedList = fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println(sortedList);

        List<String> sortedList1 = fruits.stream().sorted((o1, o2) -> o1.compareTo(o2)).collect(Collectors.toList());
        System.out.println(sortedList1);

        List<String> sortedList2 = fruits.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList2);

        // descending order
        List<String> sortedList3 = fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedList3);

        List<String> sortedList4 = fruits.stream().sorted((o1, o2) -> o2.compareTo(o1)).collect(Collectors.toList());
        System.out.println(sortedList4);
        System.out.println("-----------------------------------------------------------------------");

        // sort employee by salary in ascending and descending order

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(10,"Ramesg", 30, 40000));
        employees.add(new Employee(20,"Santosh", 29, 35000));
        employees.add(new Employee(30,"Sanjay", 30, 45000));
        employees.add(new Employee(40,"Pramod", 29, 50000));

        List<Employee> empList = employees.stream()
                .sorted((e1,e2) -> (int) (e2.getSalary() - e1.getSalary()))
                .collect(Collectors.toList());
        empList.forEach(emp -> System.out.println(emp));

        System.out.println("--------------------------------------------------------------");

        List<Employee> empList1 = employees.stream()
                .sorted(Comparator.comparingLong(Employee::getSalary))
                .collect(Collectors.toList());
        empList1.forEach(emp -> System.out.println(emp));

        System.out.println("--------------------------------------------------------------");

        List<Employee> empList2 = employees.stream()
                .sorted(Comparator.comparingLong(Employee::getSalary).reversed())
                .collect(Collectors.toList());
        empList2.forEach(emp -> System.out.println(emp));

    }
}
