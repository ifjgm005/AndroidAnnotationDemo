package com.example.tuoanlan.androidannotationdemo;

import com.example.api.Factory;

/**
 * 披萨品种-提拉米苏
 */

@Factory(
        id = "Tiramisu",
        type = Meal.class
)
public class Tiramisu implements Meal {
    @Override
    public float getPrice() {
        return 4.5f;
    }
}
