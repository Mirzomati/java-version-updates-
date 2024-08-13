package com.cydeo.tasks;

import java.util.Arrays;
import java.util.List;

public class CountNumElements {

    public static void main(String[] args) {

        List<Integer> ci = Arrays.asList(1,2,3,4);
        int count = countIf(ci, new OddPredicate());
        System.out.println("number of odd integers = " + count);

        boolean prime = (new PrimePredicate()).test(143);
        System.out.println(prime);
    }


    private static <T> int countIf(List<T> ci, UnaryPredicate<T> p) {

        int counts = 0;
        for (T elem : ci) {
            if (p.test(elem)){
                ++counts;
            }
        }
        return counts;
    }









}
