package amara.customerDetailService.controller;

import java.util.List;

import amara.customerDetailService.entity.CustomerRating;
import amara.customerDetailService.service.customerRatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class customerDetailController {

    @Autowired
    private customerRatingService CustomerDetailService;

    @RequestMapping("/")
    public ModelAndView getUserInputPage() {
        return new ModelAndView("InputCustomerId");
    }
    @RequestMapping("/checkShare")
    public ModelAndView checkCustomerDetailController (@RequestParam("CustomerId")String CustomerId){
        ModelAndView modelAndView = new ModelAndView();

        List<CustomerRating>customerRatings=customerRatingService.getCustomerRatingByCustomerId(CustomerId);

        modelAndView.addObject("CustomerRatings",customerRatings);
        modelAndView.addObject("CustomerId",CustomerId);
        modelAndView.setViewName("ShowCustomer");
        return modelAndView;
    }

}
