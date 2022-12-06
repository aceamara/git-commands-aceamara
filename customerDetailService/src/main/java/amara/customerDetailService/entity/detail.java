package amara.customerDetailService.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class detail {
    private int detailId;
    private int customerId;
    private int shareId;
    private String shareType;
    private int quantity;


}
