package com.example.tuoanlan.androidannotationdemo;

import com.example.api.Factory;

/**
 * 披萨品种-卡尔佐内
 */

@Factory(
        id = "CalzonePizza",
        type = Meal.class
)
public class CalzonePizza implements Meal {
    @Override
    public float getPrice() {
        return 8.5f;
    }
}
