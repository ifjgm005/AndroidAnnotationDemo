package com.example.tuoanlan.androidannotationdemo.original;


import com.example.tuoanlan.androidannotationdemo.CalzonePizza;
import com.example.tuoanlan.androidannotationdemo.MargheritaPizza;
import com.example.tuoanlan.androidannotationdemo.Meal;
import com.example.tuoanlan.androidannotationdemo.Tiramisu;

/**
 * 工厂类，我们希望通过工厂类来装配，而不是由披萨店来处理
 * 这样我们的披萨店就会很整洁了,
 * 但这样仍然存在一个问题那就是。当增加一个品种的时候需要继续修改工厂类
 * 到时候工厂类变的也不整洁了。所以我们需要用注解来生成MealFactory 的代码
 */
public class MealFactory {

    public Meal create(String id) {
        if (id == null) {
            throw new IllegalArgumentException("id is null!");
        }
        if ("Calzone".equals(id)) {
            return new CalzonePizza();
        }

        if ("Tiramisu".equals(id)) {
            return new Tiramisu();
        }

        if ("Margherita".equals(id)) {
            return new MargheritaPizza();
        }

        throw new IllegalArgumentException("Unknown id = " + id);
    }
}
