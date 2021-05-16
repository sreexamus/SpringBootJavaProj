package com.sree.enterprise.employee.Employee.ValueObjects;
import com.sree.enterprise.employee.Employee.Entity.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {
    private Employee employee;
    private Company company;
}
