package com.coffee.designPattern.composite;



import java.util.ArrayList;
import java.util.List;

public class CompositeTest {
    public static void main(String[] args) {
        Employee employee = new Employee("makaijian","it",3000);
        Employee testWp = new Employee("test","it",2000);
        Employee testWp2 = new Employee("test2","test",2001);
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(testWp);
        employeeList.add(testWp2);
        employee.setEmployeeList(employeeList);
        System.out.println(employee);
    }
}
