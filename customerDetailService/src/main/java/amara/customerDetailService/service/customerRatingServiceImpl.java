package amara.customerDetailService.service;

import amara.customerDetailService.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class customerRatingServiceImpl implements customerRatingService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<CustomerRating>getCustomerRatingByCustomerId(String CustomerId){

        List<CustomerRating>customerRatingList= new ArrayList<CustomerRating>();

        ShareList shareList = restTemplate.getForObject("http://localhost:8084/ratings/"+CustomerId,RatingList.class);

        for (Share share: ShareList.getShares()){

            Customer customer = restTemplate.getForObject("http://localhost:8082/movies/"+share.getCustomerId(),Customer.class);

        CustomerRating customerRating = new CustomerRating (share.getCustomerId(),Customer.getShare(),ratingGetValuation());

        CustomerRatingList.add(customerRating);

        return customerRatingList;







        }

    }



}
