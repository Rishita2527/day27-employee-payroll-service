package com.bridgelabz.test6;
import com.bridgelabz.employeePayrollService4.EmployeePayrollData;
import com.bridgelabz.employeePayrollService4.EmployeePayrollService;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeePayrollTest {
    @Test
    public void whenThreeEmployeeAddedShouldReturnCountOfEmployees() {
        EmployeePayrollData[] employeeList = { new EmployeePayrollData(1, "Rishita", 70000),
                new EmployeePayrollData(2, "Sita", 80000), new EmployeePayrollData(3, "Gita", 90000) };
        EmployeePayrollService employeePayrollService = new EmployeePayrollService(Arrays.asList(employeeList));
        employeePayrollService.writeEmployeePayrollData(EmployeePayrollService.IOService.FILE_IO);
        employeePayrollService.printData(EmployeePayrollService.IOService.FILE_IO);
        long entries = employeePayrollService.countEntries();
        assertEquals(3, entries);
    }
    //UC5-Test case
    @Test
    public void whenThreeEmployeeAddedShouldReturnCountOfEmployeesAndPrintData() {
        EmployeePayrollData[] employeeList = { new EmployeePayrollData(1, "Rishita", 70000),
                new EmployeePayrollData(2, "Sita", 80000), new EmployeePayrollData(3, "Gita", 90000) };
        EmployeePayrollService employeePayrollService = new EmployeePayrollService(Arrays.asList(employeeList));
        employeePayrollService.writeEmployeePayrollData(EmployeePayrollService.IOService.FILE_IO);
        employeePayrollService.printData(EmployeePayrollService.IOService.FILE_IO);
        employeePayrollService.printData(EmployeePayrollService.IOService.FILE_IO);
        long entries = employeePayrollService.countEntries();
        assertEquals(3, entries);
    }
         // UC6-Test case
        @Test
        public void whenReadFromFileShouldReturnListOfEmployees() {
            EmployeePayrollData[] employeeList = { new EmployeePayrollData(1, "Rishita", 70000),
                    new EmployeePayrollData(2, "Sita", 80000), new EmployeePayrollData(3, "Gita", 90000) };
            EmployeePayrollService employeePayrollService = new EmployeePayrollService(Arrays.asList(employeeList));
            employeePayrollService.writeEmployeePayrollData(EmployeePayrollService.IOService.FILE_IO);
            List<EmployeePayrollData> list = employeePayrollService.readData(EmployeePayrollService.IOService.FILE_IO);
            list.forEach(System.out::println);
            assertEquals(3, list.size());
        }
}
