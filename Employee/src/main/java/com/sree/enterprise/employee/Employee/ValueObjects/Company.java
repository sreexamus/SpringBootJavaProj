package com.sree.enterprise.employee.Employee.ValueObjects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Company {
    private Long companyId;
    private String companyName;
    private String companyAddress;
    private String  companyCode;
}
