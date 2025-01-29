package com.fundamental;

public class Employee {
    int employeeId;
    String employeeName;
    void displayDetails() {
        String employeeType="contract";
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Type: " + employeeType);
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.employeeId = 1201;
        employee.employeeName = "John Doe";
        employee.displayDetails();
    }
}
