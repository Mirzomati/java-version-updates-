package com.mirzoyon.tasks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AllDishMain {

    public static void main(String[] args) {

//        Print all dish’s name that has less than 400 calories.

        List<Dish> menu = Arrays.asList(
                new Dish("pork",false,800,Type.MEAT),
                new Dish("beef",false,700,Type.MEAT),
                new Dish("chicken",false,400,Type.MEAT),
                new Dish("fries",true,530,Type.OTHER),
                new Dish("rice",true,350,Type.OTHER),
                new Dish("fruit",true,120,Type.OTHER),
                new Dish("pizza",true,550,Type.OTHER),
                new Dish("prawns",false,300,Type.FISH),
                new Dish("salmon",false,450,Type.FISH)
        );

         List<Dish> lowCalorie = menu.stream()
                 .filter(d -> d.getCalories() <400)
                 .collect(Collectors.toList());

        System.out.println(lowCalorie);

//        Print the length of the name of each dish

        List<Integer> lengthOfName = menu.stream()
                .map(d -> d.getName().length())
                .collect(Collectors.toList());

        System.out.println("Length of each name:" + lengthOfName);



    }
}
