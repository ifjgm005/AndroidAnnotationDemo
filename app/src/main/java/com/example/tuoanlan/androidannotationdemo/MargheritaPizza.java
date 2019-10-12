package com.example.tuoanlan.androidannotationdemo;


import com.example.api.Factory;

/**
 * 披萨品种-玛格丽塔
 */

@Factory(
        id = "UargheritaPizza",
        type = Meal.class
)
public class MargheritaPizza implements Meal {
    @Override
    public float getPrice() {
        return 6.0f;
    }
}
