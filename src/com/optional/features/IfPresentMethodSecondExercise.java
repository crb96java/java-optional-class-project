package com.optional.features;

import com.pojo.Company;

import java.util.Optional;

public class IfPresentMethodSecondExercise {

    public static void main(String[] args) {

        Company hclCompany = new Company();
        hclCompany.setCompanyName("HCL");
        hclCompany.setCompanyId("H233");
        hclCompany.setCompanyPhone("+913434343");

        Optional.ofNullable(hclCompany).ifPresent(hcl ->
                {
                    hcl.setCompanyEmail("abc@hcl.com");
                    hcl.setCompanyAddress("122-B, ZA Colony, Hyderabad, 3434343");
                    System.out.println(hcl);
                }
        );

        System.out.println();

        Company wiproCompany = new Company();
        wiproCompany.setCompanyName("Wipro");
        wiproCompany.setCompanyId("W667");
        wiproCompany.setCompanyPhone("+916767575");

        Optional<String> companyName = Optional.ofNullable(wiproCompany)
                .map(wipro -> {

                            wipro.setCompanyEmail("ramesh@wipro.com");
                            wipro.setCompanyAddress("122-C, AP Colony, Bangalore, 3434343");
                            return wipro;
                        }
                ).map(w -> w.getCompanyName());

        System.out.println(companyName);
    }


}
