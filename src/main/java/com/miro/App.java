package com.miro;

import org.apache.commons.lang3.StringUtils;
import com.miro.domain.Money;
import java.math.BigDecimal;

class App {
    public static void main (String... args)
    {
        BigDecimal amount = new BigDecimal(12.46);
        Money money = Money.create(amount);
        System.out.println("Balance: " + money.balance());
        System.out.println(StringUtils.equals("hello","hello"));
    }
        
}
