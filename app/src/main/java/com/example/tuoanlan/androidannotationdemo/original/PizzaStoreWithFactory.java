package com.example.tuoanlan.androidannotationdemo.original;


import com.example.tuoanlan.androidannotationdemo.Meal;

import java.io.IOException;

/**
 *
 * 有用装配工厂的披萨店
 *这样所有的订单装配就交给工厂了
 * 披萨店就会很整洁
 * */
public class PizzaStoreWithFactory {

    private MealFactory factory = new MealFactory();

    public Meal order(String mealName) {
        return factory.create(mealName);
    }

    public static void main(String[] args) throws IOException {
        PizzaStoreWithFactory pizzaStore = new PizzaStoreWithFactory();
        Meal meal = pizzaStore.order("");
        System.out.println("Bill: $" + meal.getPrice());
    }

}