package com.wit.company.main;

import com.wit.company.models.Employee;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = new LinkedList<>();
        employees.add(new Employee(1, "Gökhan", "Şişman"));
        employees.add(new Employee(1, "Gökhan", "Şişman"));
        employees.add(new Employee(2, "Alper", "Ahıska"));
        employees.add(new Employee(2, "Alper", "Ahıska"));
        employees.add(new Employee(3, "Canan", "Kayalar"));
        employees.add(new Employee(3, "Canan", "Kayalar"));
        employees.add(new Employee(4, "Onur", "Atar"));
        employees.add(new Employee(4, "Onur", "Atar"));

        Map<Integer, Employee> employeeMap = new HashMap<>();
        List<Employee> removedEmployees = new ArrayList<>();

        Iterator<Employee> iterator = employees.iterator();

        while (iterator.hasNext()) {

            Employee employee = iterator.next();
            if (employeeMap.containsKey(employee.getId())) {
                removedEmployees.add(employee);
                iterator.remove();

            } else {
                employeeMap.put(employee.getId(), employee);

            }


        }
        System.out.println(employeeMap);
        System.out.println(removedEmployees);

    }
}