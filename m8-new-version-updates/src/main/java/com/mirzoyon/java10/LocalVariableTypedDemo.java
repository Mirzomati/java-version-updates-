package com.mirzoyon.java10;

import java.util.Arrays;


public class LocalVariableTypedDemo {
    public static void main(String[] args) {

        var str = "Cydeo";
        var num = 5;

        byte x = 1;
        var y = 1;  // int

        var price = 12.50;

        var numbers = Arrays.asList(3,4,5,6);

        var sum = 0;
        for (var eachNumber : numbers){
            sum = sum+eachNumber;
        }

        String s;
        s = "Ozzy";
      //  var s2;
    }
}
