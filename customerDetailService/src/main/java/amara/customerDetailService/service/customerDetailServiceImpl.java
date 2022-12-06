package amara.customerDetailService.service;

import amara.customerDetailService.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class customerDetailServiceImpl implements customerDetailService{

    //Instantiate a 'RestTemplate' object:
    //the '@Autowired' annotation is used to tell Spring which candidate it can use:
    //import 'RestTemplate' (which is used to call Rest API), and '@Autowired':
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<CustomerShare> getCustomerShareByCustomerID(int customerId) {

        List<CustomerShare>customerShareList = new ArrayList<CustomerShare>();

        detailList Detaillist = restTemplate.getForObject("http://localhost:8084/customer/"+customerId, detailList.class);

        for (detail Details:detailList.getDetails()){
          Share share = restTemplate.getForObject("http://localhost:8082/shares/" + detail.getShareId(),Share.class);

          CustomerShare customer = new CustomerShare(Details.getCustomerId(),share.getShareName(),Details.getQuantity(), share.getSharePrice(),(Details.getQuantity() * share.getSharePrice()), Details.getShareType());

            //add the new 'CustomerShare' object into the 'customerShareList' list:
            customerShareList.add(customer);
        }
        return customerShareList;
    }

    @Override
    public List<CustomerShare> getCustomerRatingByCustomerId(String CustomerId) {
        return null;
    }
}







