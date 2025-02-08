package com.pojo;

import lombok.*;

import java.sql.Time;
import java.util.HashMap;
import java.util.Map;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    //properties of Employee Object
    private int empId;
    private String empName;
    private int empAge;
    private double empSalary;
    private String companyName;
    private String address;
    private String empMobile;
    private String empEmail;
    private EmployeeStatus status;
    private EmployeeType type;

    public Employee(Employee employee) {
    }

    public enum EmployeeStatus {
        //Active: The employee is currently working for the company
        ACTIVE("ACTIVE"),
        //Inactive: The employee is no longer working for the company
        INACTIVE("INACTIVE"),
        //Onboarding: The employee is new to the company
        ONBOARDING("ONBOARDING"),
       // Unpaid leave of absence: The employee is on leave without pay
        UNPAID_LEAVE_OF_ABSENCE("UNPAID_LEAVE_OF_ABSENCE"),
        //Intern: The employee is a temporary employee gaining work experience
        INTERN("INTERN"),;

        private final String status;
        private EmployeeStatus(String status) {
            this.status = status;
        }

        public String getStatus() {
            return status;
        }
        public void setStatus(String status) {

        }
    }


    public enum EmployeeType {

        //Contract Employee: Specific terms for a set period.
        CONTRACT("CONTRACT"),
        //Full-Time Employee: 40+ hours/week with benefits.
        FULL_TIME("FULL_TIME"),
        //Independent Contractor: Task or project-based.
        INDEPENDENT("INDEPENDENT"),
        //Intern/Apprentice: Gaining work experience.
        INTERN_OR_APPRENTICE("INTERN_OR_APPRENTICE"),
        //Part-Time Employee: Fewer hours, often without benefits.
        PART_TIME("PART_TIME"),
        //Self-Employed: Operates own business.
        SELF_EMPLOYEE("SELF_EMPLOYEE"),
        //Temporary/Seasonal Employee: Short-term needs in sectors like agriculture.
        TEMPORARY_OR_SEASONAL("TEMPORARY_OR_SEASONAL"),
        //Unemployed: Actively seeking employment.
        UNEMPLOYED("UNEMPLOYED"),
        //Volunteer: Unpaid work for social causes.
        VOLUNTARY("VOLUNTARY"),;

        private final String value;

        private static final Map<String, EmployeeType> EMPLOYEETYPES = new HashMap<String, EmployeeType>();
        private EmployeeType(String value) {
            this.value = value;
        }

        static{
            for (EmployeeType employeeType : EmployeeType.values()) {
                EMPLOYEETYPES.put(employeeType.value, employeeType);
            }
        }


    }
}
