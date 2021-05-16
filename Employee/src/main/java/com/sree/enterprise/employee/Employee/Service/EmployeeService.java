package com.sree.enterprise.employee.Employee.Service;

import ch.qos.logback.classic.spi.TurboFilterList;
import ch.qos.logback.core.util.LocationUtil;
import com.sree.enterprise.employee.Employee.Entity.Employee;
import com.sree.enterprise.employee.Employee.Repository.EmployeeRepository;
import com.sree.enterprise.employee.Employee.ValueObjects.Company;
import com.sree.enterprise.employee.Employee.ValueObjects.ResponseTemplateVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private RestTemplate restTemplate;

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public ResponseTemplateVO getEmployeeWithCompany(Long id) {
        ResponseTemplateVO vo = new ResponseTemplateVO();
        Employee employee = employeeRepository.findByEmployeeId(id);
        log.info("employee info with id "+ id + " " + employee);
        Company company =
                restTemplate.getForObject("http://localhost:9090/company/" + employee.getCompanyId()
                        ,Company.class);
        vo.setEmployee(employee);
        vo.setCompany(company);
        return vo;
    }
}
