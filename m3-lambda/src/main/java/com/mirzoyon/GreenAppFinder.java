package com.mirzoyon;

import java.util.ArrayList;
import java.util.List;

public class GreenAppFinder implements FindApple<Apple>{


    @Override
    public List findAll(List<Apple> list) {

        List<Apple> greenApples = new ArrayList<Apple>();

        for (Apple apple : list) {
            if (apple.getColor().equals(Colors.GREEN)) greenApples.add(apple);
        }
        return greenApples;
    }
}
