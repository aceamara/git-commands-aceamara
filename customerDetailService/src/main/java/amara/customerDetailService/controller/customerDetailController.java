package amara.customerDetailService.controller;

import java.util.List;


import amara.customerDetailService.entity.CustomerShare;

import amara.customerDetailService.service.customerDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class customerDetailController {

    @Autowired
    private amara.customerDetailService.service.customerDetailService customerDetailService;

    @RequestMapping("/")
    public ModelAndView getUserInputPage() {
        return new ModelAndView("InputCustomerId");
    }
    @RequestMapping("/checkShares")
    public ModelAndView checkCustomerDetailController (@RequestParam("CustomerId")String customerId){
        ModelAndView modelAndView = new ModelAndView();

        List<CustomerShare>customerShares= amara.customerDetailService.service.customerDetailService.getCustomerShareByCustomerId(customerId);

        modelAndView.addObject("CustomerRatings",customerShares);
        modelAndView.addObject("CustomerId",customerId);
        modelAndView.setViewName("ShowCustomerShares");
        return modelAndView;
    }

}
