package com.miro.domain;

public class Account extends Currency {
    private String type;
    public Account(String type){
        super(type);
        this.type = type;
    }
    public String getType(){
        return this.type;
    }
}
