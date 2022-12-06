package amara.customerDetailService.service;

import amara.customerDetailService.entity.CustomerShare;

import java.util.List;

public interface customerDetailService {


    static List<CustomerShare> getCustomerShareByCustomerId(String CustomerId) {
        return null;
    }

    List<CustomerShare> getCustomerShareByCustomerID(int customerId);

    List<CustomerShare> getCustomerRatingByCustomerId(String CustomerId);
}


