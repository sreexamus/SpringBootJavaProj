package com.sree.enterprise.company.Company.repository;

import com.sree.enterprise.company.Company.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long>{
    Company findByCompanyId(Long id);
}
