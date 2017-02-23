package be.cegeka.domain.controller;

import be.cegeka.domain.customer.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Inject
    private CustomerService customerService;

//    @ResponseBody
//    @RequestMapping(method = RequestMethod.POST)
//    public void addCustomer(
//
//    )
}
