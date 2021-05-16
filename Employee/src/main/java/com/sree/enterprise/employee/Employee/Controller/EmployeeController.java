package com.sree.enterprise.employee.Employee.Controller;

import com.sree.enterprise.employee.Employee.Entity.Employee;
import com.sree.enterprise.employee.Employee.Service.EmployeeService;
import com.sree.enterprise.employee.Employee.ValueObjects.ResponseTemplateVO;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/save")
    public Employee saveEmployee(@RequestBody Employee employee) {
           return employeeService.saveEmployee(employee);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getEmployeeWithCompany(@PathVariable("id") Long id) {
         return employeeService.getEmployeeWithCompany(id);
    }
}
