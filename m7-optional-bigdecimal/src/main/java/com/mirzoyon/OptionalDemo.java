package com.mirzoyon;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(2,4,2,10,23);

        //empty()-isPresent()

        Optional<String> empty = Optional.empty();
        System.out.println(empty);
        System.out.println(empty.isPresent());

        System.out.println("______ //empty()-isPresent()______");

        System.out.println(Optional.of(number).isPresent());

        //ifPresent
        System.out.println("_____//ifPresent______");

        Optional<Integer> bigNumber = number.stream().filter(x-> x>100).findAny();
        bigNumber.ifPresent(System.out::println); //nothing gets printed. Even though we have a null it doesnt cause a null pointer exception.

        //get
        System.out.println("_________//get_________");
//        System.out.println(bigNumber.get()); //gives you no value exception

        //orElse
        System.out.println("________//orElse__________");
        System.out.println(bigNumber.orElse(5));










    }
}
