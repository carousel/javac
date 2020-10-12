package com.miro;

import com.miro.domain.Account;
import com.miro.domain.Money;
import java.math.BigDecimal;
import org.apache.commons.lang3.*;

class App {
    String str;
    public static void main (String... args)
    {
        Account account = new Account("Bank Account");
        System.out.println(account.getType());
        BigDecimal amount = new BigDecimal(10);
        BigDecimal amount1 = new BigDecimal(17);
        Money money = Money.fromAmount(amount);
        Money money1 = Money.fromAmount(amount1);
        Money newMoney = Money.fromAmount(money1.sub(money).balance());
        System.out.println("Add: " + money.add(money1).balance());
        System.out.println("Subtract: " + newMoney.balance());
        System.out.println("Add back: " + money.add(newMoney).add(money).balance());
    }
        
}
