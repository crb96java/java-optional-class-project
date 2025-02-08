package com.enums.features;

import com.exceptions.BusinessException;
import com.pojo.Employee;

public class EnumDemoExamples {

    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setEmpId(123);
        employee.setEmpName("John");
        employee.setEmpAge(30);
        employee.setEmpSalary(5000);
        employee.setCompanyName("HCL");
        employee.setAddress("12-B, AP Colony, Hyderabad, 500023");
        employee.setEmpMobile("34353535");
        employee.setEmpEmail("john@gmail.com");
        employee.setStatus(Employee.EmployeeStatus.ONBOARDING);
        employee.setType(Employee.EmployeeType.CONTRACT);

        System.out.println(employee);

        String empStatus = String.valueOf(employee.getStatus());

        switch(Employee.EmployeeStatus.valueOf(empStatus)){
            case ACTIVE:
                System.out.println("Employee Status is ACTIVE");
                break;
            case INACTIVE:
                System.out.println("Employee Status is INACTIVE");
                break;
            case ONBOARDING:
                System.out.println("Employee Status is ONBOARDING");
                break;
            case UNPAID_LEAVE_OF_ABSENCE:
                System.out.println("Employee Status is UNPAID_LEAVE_OF_ABSENCE");
                break;
            default:
                throw new BusinessException("Employee Status is not available");

        }



    }
}
