package com.mirzoyon.tasks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class numberOfCharactersStream {

    public static void main(String[] args) {

//        Given a list of words, print the number of characters for each word.

        List<String> words = Arrays.asList("JAVA","APPLE","HONDA","DEVELOPER");

       List<Integer> numLength = words.stream()
               .map(String::length)
               .collect(Collectors.toList());

        System.out.println(numLength);
    }
}
