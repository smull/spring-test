package com.levelup.spring.dao;

import com.levelup.spring.model.nasdaq.Company;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by SMULL on 3/20/2015.
 */
public interface CompanyRepository {

    public List<Company> getCompanies();
}
