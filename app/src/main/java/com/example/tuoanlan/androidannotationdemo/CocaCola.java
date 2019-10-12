package com.example.tuoanlan.androidannotationdemo;

import com.example.api.Factory;

@Factory(type = Drink.class,id = "CocaCola")
public class CocaCola implements Drink{
    @Override
    public float getPrice() {
        return 5f;
    }
}
