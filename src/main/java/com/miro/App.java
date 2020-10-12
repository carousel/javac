package com.miro;

import com.miro.domain.Money;
import java.math.BigDecimal;
import org.apache.commons.lang3.*;

class App {
    String str;
    public static void main (String... args)
    {
        String str = "123";
        BigDecimal amount = new BigDecimal(10);
        BigDecimal amount1 = new BigDecimal(17);
        Money money = Money.fromAmount(amount);
        BigDecimal balance = Money
                                .add(money)
                                .add(money)
                                .balance();
        //System.out.println(balance);
        System.out.println(Money.sub(amount1).balance());
    }
        
}
