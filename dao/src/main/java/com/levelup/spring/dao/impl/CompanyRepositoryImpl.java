package com.levelup.spring.dao.impl;

import com.levelup.spring.dao.CompanyRepository;
import com.levelup.spring.model.nasdaq.Company;
import com.levelup.spring.model.nasdaq.ExchangeRoom;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SMULL on 3/20/2015.
 */
@Component("companyRepository")
public class CompanyRepositoryImpl implements CompanyRepository {

    @Override
    public List<Company> getCompanies() {
        List<Company> companies = new ArrayList<>();
        ExchangeRoom exchangeRoom = new ExchangeRoom();
        companies.addAll(exchangeRoom.fillByCompanies());
        return companies;
    }
}
