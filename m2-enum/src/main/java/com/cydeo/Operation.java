package com.cydeo;

public enum Operation {

    PLUS, MINUS, MULTIPLY, DIVIDE; //each constant is object(new) of Operation, Thats why it prints "Constructorrr"
    private Operation(){
        System.out.println("Constructorrr");
    }
}
