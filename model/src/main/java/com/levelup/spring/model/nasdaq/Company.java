package com.levelup.spring.model.nasdaq;




/**
 * Created by java on 19.03.2015.
 */

public class Company {

    private String name;



    public Company() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSellerPrice() {
        return Utils.getRandom(100,300);
    }


    public Double getBuyerPrice() {
        return  Utils.getRandom(100,300);
    }

}
