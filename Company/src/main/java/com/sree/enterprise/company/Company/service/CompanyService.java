package com.sree.enterprise.company.Company.service;

import com.sree.enterprise.company.Company.entity.Company;
import com.sree.enterprise.company.Company.repository.CompanyRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CompanyService {
    @Autowired
    private CompanyRepository companyRepository;

    public Company saveCompany(Company company) {
        log.info("inside company services");
        return companyRepository.save(company);
    }

    public Company findCompany(Long id) {
        return companyRepository.findByCompanyId(id);
    }
}
