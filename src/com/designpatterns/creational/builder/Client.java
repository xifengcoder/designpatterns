package com.designpatterns.creational.builder;

/**
 * Created by xifeng.yang on 2020/2/4
 */
public class Client {
    public static void main(String[] args) {
        NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8).calories(100).sodium(35)
                .carbohydrate(27).build();
    }
}
