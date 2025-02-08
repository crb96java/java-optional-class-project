package com.pojo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
public class Company {

    private String companyName;
    private String companyId;
    private String companyPhone;
    private String companyEmail;
    private String companyAddress;
    private String companyRegistrationStartDate;
    private String companyStatus;
    private String companyRegistrationEndDate;

    public enum CompanyCategory {

    }

}
