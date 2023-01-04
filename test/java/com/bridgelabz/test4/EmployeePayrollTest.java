package com.bridgelabz.test4;
import com.bridgelabz.employeePayrollService4.EmployeePayrollData;
import com.bridgelabz.employeePayrollService4.EmployeePayrollService;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
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
}
