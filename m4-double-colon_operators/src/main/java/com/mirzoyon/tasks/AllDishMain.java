package com.mirzoyon.tasks;

import java.awt.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AllDishMain {

    public static void main(String[] args) {

//        Print all dish’s name that has less than 400 calories.

        List<Dish> menu = Arrays.asList(
                new Dish("apple sauce",false,120,Type.MEAT,Color.BLUE),
                new Dish("beef",false,700,Type.MEAT,Color.DINO),
                new Dish("chicken",false,400,Type.MEAT,Color.BLUE),
                new Dish("fries",true,530,Type.OTHER,Color.GREEN),
                new Dish("rice",true,350,Type.OTHER,Color.AQUA),
                new Dish("apple sauce",true,120,Type.OTHER,Color.AQUA),
                new Dish("pizza",true,550,Type.OTHER,Color.GREEN),
                new Dish("prawns",false,300,Type.FISH,Color.GREEN),
                new Dish("salmon",false,450,Type.FISH,Color.RED)
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
        System.out.println("_____________________________________________________");

        List<Dish> allDishes = menu.stream()
                .sorted(Comparator
                        .comparingInt(Dish::getCalories)
                        .thenComparing(Dish::getName)
                        .thenComparing(Dish -> Dish.getColor().toString()))
                .collect(Collectors.toList());

        System.out.println(allDishes);





    }
}
