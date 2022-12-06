package amara.customerDetailService.resource;


import amara.customerDetailService.entity.CustomerShareList;
import amara.customerDetailService.service.customerDetailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CustomerRatingResource {

    @Autowired
    private CustomerRatingResource customerRatingResource;

    @GetMapping(path="/customer/myshares/{cId}",produces = MediaType.APPLICATION_JSON_VALUE)
    public CustomerShareList getCustomerRatingByCustomerIdResource(@PathVariable("cId")String CustomerId){
        return new CustomerShareList(customerDetailService.getCustomerShareByCustomerId(CustomerId));

    }
}
