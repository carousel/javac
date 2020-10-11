package com.miro;

import com.miro.domain.Money;
import java.math.BigDecimal;
import org.apache.commons.lang3.*;

class App {
    String str;
    public static void main (String... args)
    {
        String str = "123";
        BigDecimal amount = new BigDecimal(14.372);
        Money money = Money.create(amount);
        System.out.println("Balance: " + money.balance());
        StringBuilder sb = new StringBuilder();
        sb.append(sb)
            .append(" One")
            .append(" Two")
            .append(" Three")
            .append(" Four");
        System.out.println(sb);
    }
        
}
