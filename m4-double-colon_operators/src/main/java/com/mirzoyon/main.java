package com.mirzoyon;

import lombok.ToString;

import java.util.function.Predicate;

public class main {

    public static void main(String[] args) {

       Predicate<Integer> pred = (p) -> p % 2 == 0 ? true : false;

       Calculate cal1 = (a,b) -> System.out.println( a+b) ;
       Calculate cal2 = (a,b) -> Calculator.findSum(a, b);



    }
}
