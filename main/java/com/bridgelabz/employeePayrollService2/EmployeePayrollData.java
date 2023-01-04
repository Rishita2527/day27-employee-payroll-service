package com.bridgelabz.employeePayrollService2;

public class EmployeePayrollData {
    int id;
    String name;
    double salary;

    public EmployeePayrollData(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "EmployeePayrollData [employeeId=" + id + ", employeeName=" + name + ", employeeSalary="
                + salary + "]";
    }
}