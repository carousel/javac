package com.miro.domain;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Money {
    private BigDecimal amount;
    static BigDecimal balance;
    private RoundingMode roundingMode;
    {
        this.roundingMode = RoundingMode.HALF_EVEN;
    }
    private Money(BigDecimal amount){
        balance = amount.setScale(2, roundingMode);
        this.amount = amount;
    }
    public static Money fromAmount(BigDecimal amount){
        return new Money(amount);
    }
    public static Money create(BigDecimal amount){
        return new Money(amount);
    }
    public BigDecimal balance(){
        return amount.setScale(2, roundingMode);
    }
    public Money add(Money money){
        return Money.create(balance().add(money.balance()));
    }
    public Money sub(Money money){
        if(balance().compareTo(money.balance()) == -1){
            throw new RuntimeException("Out of balance");
        }
        return Money.create(balance().subtract(money.balance()));
    }
}
