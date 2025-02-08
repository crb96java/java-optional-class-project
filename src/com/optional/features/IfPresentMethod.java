package com.optional.features;

import com.pojo.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static com.pojo.Employee.EmployeeStatus.ACTIVE;
import static com.pojo.Employee.EmployeeType.FULL_TIME;

/*
* In this class we can learn about ifPresent() method from Optional class
* void ifPresent(Consumer<? super T> consumer) :
        - If a value is present, invoke the specified consumer with the value;
          Otherwise do nothing.
* */
public class IfPresentMethod {

    public static void main(String[] args) {

        String newCompanyName = "Wipro";
        List<Employee> listOfEmployees = Arrays.asList(
                new Employee(5, "ramu", 28, 24999, "Capgemini", "12/B, AP Colony, Hyderabad, 500003", "4535353", "a@gmail.com", ACTIVE, FULL_TIME),
                new Employee(2, "sam", 40, 55667, "HSBC", "11/S, ADD Colony, Hyderabad, 500003", "4535353", "a@gmail.com", ACTIVE, FULL_TIME),
                new Employee(1, "naidu", 23, 78555, "IBC", "10/B, RT Colony, Pune, 500003", "4535353", "a@gmail.com", ACTIVE, FULL_TIME),
                new Employee(4, "laxmi", 33, 12343, "HSBC", "12/B, YU Colony, Bangalure, 500003", "4535353", "a@gmail.com", ACTIVE, FULL_TIME),
                new Employee(3, "janu", 31, 67788, "Wipro", "12/B, AP Colony, Hyderabad, 500003", "4535353", "a@gmail.com", ACTIVE, FULL_TIME));

        //Exercise one
        if (Optional.ofNullable(listOfEmployees).isPresent()) {
            listOfEmployees.stream()
                    .filter(l -> l.getCompanyName().contains("HSBC"))
                    .findFirst()
                    .ifPresentOrElse(
                            Employee::new,
                            () -> System.out.println("Employee not found")
                    );

        }
        System.out.println(listOfEmployees);

        System.out.println();
        System.out.println("Find the Employee company name is null value");
        //Exercise two
        Optional.of(listOfEmployees).ifPresent(
                emp->emp.stream()
                        .filter(l->l.getCompanyName().isEmpty())
                        .forEach(System.out::println));

    }
}
