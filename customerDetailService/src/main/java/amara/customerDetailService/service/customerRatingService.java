package amara.customerDetailService.service;

import amara.customerDetailService.entity.CustomerRating;

import java.util.List;

public interface customerRatingService {

    static List<CustomerRating> getCustomerRatingByCustomerId(String CustomerId);
}
