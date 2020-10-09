package com.miro.domain;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Money {
    private BigDecimal amount;
    private Money(BigDecimal amount){
        this.amount = amount;
    }
    public static Money create(BigDecimal amount){
        return new Money(amount);
    }
    public  BigDecimal balance(){
        return amount.setScale(2, RoundingMode.HALF_EVEN);
    }
}
