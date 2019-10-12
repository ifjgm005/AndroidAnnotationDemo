package com.example.tuoanlan.androidannotationdemo.original;

import com.example.tuoanlan.androidannotationdemo.CalzonePizza;
import com.example.tuoanlan.androidannotationdemo.MargheritaPizza;
import com.example.tuoanlan.androidannotationdemo.Meal;
import com.example.tuoanlan.androidannotationdemo.Tiramisu;

import java.io.IOException;


/**
 * 这是个披萨店（原始的披萨店）
 * 如果不用注解，客户需要下订单的时候，会是这样。
 * 有很多的 if 判断
 * 并且每当我们添加一种新的披萨，我们都要添加一条新的if语句
 * 非常的烦躁，后面维护成本会原来越高。
 */
public class PizzaStoreOriginal {

    public Meal order(String mealName) {

        if (mealName == null) {
            throw new IllegalArgumentException("Name of the meal is null!");
        }

        if ("Margherita".equals(mealName)) {
            return new MargheritaPizza();
        }

        if ("Calzone".equals(mealName)) {
            return new CalzonePizza();
        }

        if ("Tiramisu".equals(mealName)) {
            return new Tiramisu();
        }

        throw new IllegalArgumentException("Unknown meal '" + mealName + "'");
    }

    public static void main(String[] args) throws IOException {
        PizzaStoreOriginal pizzaStore = new PizzaStoreOriginal();
        Meal meal = pizzaStore.order("");
        System.out.println("Bill: $" + meal.getPrice());
    }
}