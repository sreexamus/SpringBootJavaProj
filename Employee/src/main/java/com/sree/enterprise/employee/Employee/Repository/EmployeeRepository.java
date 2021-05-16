package com.sree.enterprise.employee.Employee.Repository;

import com.sree.enterprise.employee.Employee.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Employee findByEmployeeId(Long id);
}
