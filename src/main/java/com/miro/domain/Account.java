package com.miro.domain;

public class Account extends Currency {
    public static int i;
    static {
        i = 125;
    }
    private String type;
    public Account(String type){
        super(type);
        this.type = type;
    }
    public static Integer getI(){
        i = 999;
        return i;
    }
    public String getType(){
        return this.type;
    }
}

