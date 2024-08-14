package com.cydeo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppleMain_Practice {

    public static void main(String[] args) {

        List<Apple> appleInventory = new ArrayList<>();
        appleInventory.add(new Apple(286,Colors.GREEN));
        appleInventory.add(new Apple(140, Colors.RED));
        appleInventory.add(new Apple(275,Colors.YELLOW));
        appleInventory.add(new Apple(142, Colors.YELLOW));
        appleInventory.add(new Apple(431,Colors.RED));
        appleInventory.add(new Apple(231, Colors.RED));
        appleInventory.add(new Apple(326,Colors.GREEN));
        appleInventory.add(new Apple(123, Colors.GREEN));

       List<Apple> greenApples = findApple(appleInventory,new GreenAppFinder());
       List<Apple> HeavyApples = findApple(appleInventory,new HeavyApplesFinder());
       System.out.println("Green Apples: " + greenApples);
       System.out.println("Heavy Apples: " +HeavyApples);


    }

    public static List<Apple> findApple(List apples, FindApple findApple){

        return findApple.findAll(apples);
    }
}
