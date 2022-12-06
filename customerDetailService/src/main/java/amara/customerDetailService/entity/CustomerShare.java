package amara.customerDetailService.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class CustomerShare {

    private String customerId;
    private String shareName;
    private int quantity;
    private double UnitPrice;
    private double totalValuation;
    private String shareType;


    public CustomerShare(int customerId, String shareName, int quantity, double sharePrice, double totalValuation, String shareType) {
    }
}
