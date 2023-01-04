package com.bridgelabz.employeePayrollService3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class EmployeePayrollService {
        public enum IOService {
            CONSOLE_IO, FILE_IO, DB_IO, REST_IO
        }

        private List<EmployeePayrollData> employeePayrollList;

        public EmployeePayrollService() {
        }

        public EmployeePayrollService(List<EmployeePayrollData> employeePayrollList) {
            this.employeePayrollList = employeePayrollList;
        }

        public static void main(String[] args) {
            System.out.println("Welcome to Employee Payroll Services Program");
            List<EmployeePayrollData> employeePayrollList = new ArrayList<EmployeePayrollData>();
            EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollList);
            Scanner consoleInputReader = new Scanner(System.in);
            employeePayrollService.readEmployeeData(consoleInputReader);
            employeePayrollService.writeEmployeeData();
        }

        private void readEmployeeData(Scanner consoleInputReader) {
            System.out.println("Enter employee ID : ");
            int id = Integer.parseInt(consoleInputReader.nextLine());
            System.out.println("Enter employee name : ");
            String name = consoleInputReader.nextLine();
            System.out.println("Enter employee salary : ");
            double salary = Double.parseDouble(consoleInputReader.nextLine());
            employeePayrollList.add(new EmployeePayrollData(id, name, salary));
        }

        private void writeEmployeeData() {
            System.out.println("Writing Employee Payroll Data to Console\n" + employeePayrollList);
        }
}
