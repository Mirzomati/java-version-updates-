package com.mirzoyon;

import java.util.ArrayList;
import java.util.List;

public class HeavyApplesFinder implements FindApple<Apple>{
    @Override
    public List<Apple> findAll(List<Apple> list) {
        List<Apple> heavyApples = new ArrayList<Apple>();

        for (Apple apple : list) {
            if (apple.getWeight() > 200) heavyApples.add(apple);
        }
        return heavyApples;
    }

}
