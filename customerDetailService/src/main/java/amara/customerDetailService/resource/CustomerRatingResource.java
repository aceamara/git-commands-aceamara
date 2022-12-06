package amara.customerDetailService.resource;

import amara.customerDetailService.entity.CustomerRatingList;
import amara.customerDetailService.service.customerRatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestContoller
public class CustomerRatingResource {

    @Autowired
    private CustomerRatingResource customerRatingResource;

    @GetMapping(path="/customer/myshares/{uId}",produces = MediaType.APPLICATION_JSON_VALUE)
    public CustomerRatingList getCustomerRatingByCustomerIdResource(@PathVariable("uId")String CustomerId){
        return new CustomerRatingList(customerRatingService.getCustomerRatingByCustomerId(CustomerId));

    }
}
