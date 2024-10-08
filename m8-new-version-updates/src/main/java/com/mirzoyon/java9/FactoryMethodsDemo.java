package com.mirzoyon.java9;

import java.util.*;

public class FactoryMethodsDemo {
    public static void main(String[] args) {

        //creating unmodifiable list before java9
        List<String> courses = Collections.unmodifiableList(Arrays.asList("Java", "Spring", "Agile"));

//        courses.add("TS");
        System.out.println(courses);

        //creating an unmodifiable list after Java 9
        List<String> myCourses = List.of("Java", "Spring", "Agile");

        //Creating unmodifiable Set after java9
        Set<String> myProducts = Set.of("Milk", "Bread", "Butter");

        //Creating unmodifiable Map after java9
        Map<String, Integer> myCart = Map.ofEntries(
                Map.entry("Samsung TV", 1),
                Map.entry("PSP", 1),
                Map.entry("Chair", 5)
        );





    }
}
