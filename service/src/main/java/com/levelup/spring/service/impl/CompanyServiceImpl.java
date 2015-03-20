package com.levelup.spring.service.impl;

import com.levelup.spring.dao.CompanyRepository;
import com.levelup.spring.model.nasdaq.Company;
import com.levelup.spring.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by SMULL on 3/20/2015.
 */
@Service("companyService")
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public List<Company> getcompanies() {
        return companyRepository.getCompanies();
    }
}
