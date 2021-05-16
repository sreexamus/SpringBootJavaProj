package com.sree.enterprise.company.Company.controller;

import com.sree.enterprise.company.Company.entity.Company;
import com.sree.enterprise.company.Company.service.CompanyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping(value = "/company")
public class CompanyController {
    @Autowired
    private CompanyService companyService;

    @PostMapping("/save")
    public Company saveCompany(@RequestBody Company company) {
        log.info("inside save CompanyController");
        return companyService.saveCompany(company);
    }

    @GetMapping("/{id}")
    public Company fetchCompany(@PathVariable("id") Long id) {
        return  companyService.findCompany(id);
    }
}
