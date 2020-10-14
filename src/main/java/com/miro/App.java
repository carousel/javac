package com.miro;

import org.apache.commons.lang3.StringUtils;
import com.miro.domain.*;
import java.math.BigDecimal;
import java.util.function.*;
import java.util.*;

public class App {
    String str;
    public static void main (String... args)
    {
        
        System.out.println(Account.getI());
        //Calculate calc = () -> 123;
        //System.out.println("Lambda supplier: " + App.lambda(calc));
        //Predicate<Integer> p = (a) -> a > 125;
        //App app = new App();
        //System.out.println("Override equals on object: " + app.equals(app));
        //System.out.println("Predicate check: " + app.check(p, 12670));

        //System.out.println("String utils equals: " + StringUtils.equals("abc","def"));
        //BigDecimal amount = new BigDecimal(10);
        //BigDecimal amount1 = new BigDecimal(17);
        //Money money = Money.fromAmount(amount);
        //Money money1 = Money.fromAmount(amount1);
        //Money newMoney = Money.fromAmount(money1.sub(money).balance());
        //System.out.println("Add: " + money.add(money1).balance());
        //System.out.println("Subtract: " + newMoney.balance());
        //System.out.println("Add back: " + money.add(newMoney).add(money).balance());

        //Map<String, String> names = new HashMap<>();
        //names.put("Miroslav", "HashMap");
        //try{
            //if(names.get("Miroslav") == null){
                //throw new RuntimeException("Explicitly");
            //}
        //}catch(RuntimeException e){
            //System.out.println("My message: " + e.getMessage());
        //}finally{
            //System.out.println("Finally");
        //}
        //System.out.println(names.get("Miroslav"));
        //List<String> cities = new ArrayList();
        //cities.add("Berlin");
        //cities.add("Amsterdam");
        //cities.add("Rome");
        //cities.stream().forEach(c -> {
            //System.out.println(c);
        //});
        //try{
            //throwMe();
        //}catch(Exception e){
            //e.printStackTrace();
            //System.out.println(e.getMessage());
        //}
        

    }
    public static Integer lambda(Calculate c){
        return c.get();
    }
    public boolean check(Predicate<Integer> p, Integer a){
        return p.test(a);
    }
    public static void throwMe() {
        var i = 125;
        if(i < 120){
            throw new RuntimeException("Problem1");
        }
        if(i < 12500){
            throw new RuntimeException("Problem2");
        }
    }
    public boolean equals(Object o){
        return this == o;
    }
        
}
