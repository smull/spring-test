package com.levelup.spring.view.nasdaq;

import com.levelup.spring.model.nasdaq.Company;
import com.levelup.spring.model.nasdaq.ExchangeRoom;
import com.levelup.spring.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by java on 19.03.2015.
 */
@Controller
public class OrderController  {

    @Autowired
    private CompanyService companies;

    @RequestMapping(value = "/price", method = RequestMethod.GET)
    public String getAllCompanies(Model model){
          //ExchangeRoom exchangeRoom = new ExchangeRoom();
          //exchangeRoom.fillByCompanies();


          //List<Company> companies = exchangeRoom.getCompanies();
          model.addAttribute("companies", companies.getcompanies());
          /*for(Company company : companies) {
              model.addAttribute(company.getName(),company.getName());
              model.addAttribute("sell"+company.getName(),company.getSellerPrice());
              model.addAttribute("buy"+company.getName(),company.getBuyerPrice());
              System.out.println(company.getBuyerPrice());
          }*/


//        ModelAndView result = new ModelAndView();
//        result.addObject("userName",userName);
//        result.setViewName("custom");
         // model.addAttribute(, exchangeRoom);
        return "order";
    }

    @RequestMapping(value = "/updateinfo", method = RequestMethod.GET)
    @ResponseBody
    public List<Company> getCompanyList() {

        return companies.getcompanies();
    }


}
