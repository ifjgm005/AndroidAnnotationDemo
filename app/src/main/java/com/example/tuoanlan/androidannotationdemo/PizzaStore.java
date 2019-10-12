package com.example.tuoanlan.androidannotationdemo;

import java.util.Scanner;

public class PizzaStore {
    public static void main(String[] args) {
        MealFactory mealFactory = new MealFactory();
        Meal meal = mealFactory.create(readPizzaNameFromConsole());
        System.out.println("Bill: $" + meal.getPrice());
    }

    private static String readPizzaNameFromConsole() {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入披萨名称：");
        String lin = "";
        lin = s.nextLine();
        System.out.println("读取披萨名称结束！！");
        return lin;
    }
}
