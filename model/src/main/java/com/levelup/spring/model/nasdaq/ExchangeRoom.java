package com.levelup.spring.model.nasdaq;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by java on 19.03.2015.
 */
public class ExchangeRoom {

    private Company company;

    private List<Company> companies;

    public ExchangeRoom() {
        companies = new ArrayList<Company>();
    }


    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public List<Company> getCompanies() {
        return companies;
    }

    public void setCompanies(List<Company> companies) {
        this.companies = companies;
    }

    public List<Company> fillByCompanies() {
        Company appleCompany = new Company();
        appleCompany.setName("Apple");


        Company ciscoCompany = new Company();
        ciscoCompany.setName("Cisco");


        Company intelCompany = new Company();
        intelCompany.setName("Intel");


        companies.add(appleCompany);
        companies.add(ciscoCompany);
        companies.add(intelCompany);

        return companies;
    }


}
