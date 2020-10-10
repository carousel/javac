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
        System.out.println(StringUtils.equals("hello","hello"));
        System.out.println("hello hello hello finally");
        System.out.println(Integer.valueOf(str));
        System.out.println(Integer.parseInt(str));
    }
        
}
