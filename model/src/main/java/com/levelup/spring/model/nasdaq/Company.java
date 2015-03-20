package com.levelup.spring.model.nasdaq;

import org.springframework.stereotype.Component;

/**
 * Created by java on 19.03.2015.
 */
@Component
public class Company {

    private String name;
    private String sellerPrice;
    private String buyerPrice;

    public Company() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSellerPrice() {
        return sellerPrice;
    }

    public void setSellerPrice(String sellerPrice) {
        this.sellerPrice = sellerPrice;
    }

    public String getBuyerPrice() {
        return buyerPrice;
    }

    public void setBuyerPrice(String buyerPrice) {
        this.buyerPrice = buyerPrice;
    }
}
