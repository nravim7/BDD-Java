package org.ravi;


public class DiscountService {
    public String getDiscount(int amount) {
        String discountPercentage = "";
        if(amount>5000 && amount<10000) {
            discountPercentage = "10%";
        } else if(amount>10000) {
            discountPercentage = "15%";
        }
        return discountPercentage;
    }

}
