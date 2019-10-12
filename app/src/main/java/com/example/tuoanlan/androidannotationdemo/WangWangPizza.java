package com.example.tuoanlan.androidannotationdemo;

import com.example.api.Factory;
@Factory(id="wangwang",type = Meal.class)
public class WangWangPizza implements Meal {

    @Override
    public float getPrice() {
        return 9.9f;
    }
}
