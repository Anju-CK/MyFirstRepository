package dataTypes;

import java.math.BigDecimal;
public class SimpleInterestCalculator {
    BigDecimal principal;
    BigDecimal  interest;



    public SimpleInterestCalculator(String principal, String interest) {
        this.principal = new BigDecimal(principal);
        this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
    }



    public BigDecimal calculateTotalValue(int numberOfYears) {
        //totalvalue=principal+principal*interest*numberofyears
        BigDecimal totalValue=principal.add(principal.multiply(interest).multiply(new BigDecimal(numberOfYears)));
        return totalValue;
    }

}
