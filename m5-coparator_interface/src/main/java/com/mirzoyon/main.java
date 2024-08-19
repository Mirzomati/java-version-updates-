package com.mirzoyon;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class main {

    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(10,0,15,5,20);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
    }
}
