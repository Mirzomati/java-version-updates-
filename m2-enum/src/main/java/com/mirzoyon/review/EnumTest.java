package com.mirzoyon.review;

import java.util.Arrays;

public class EnumTest {

    public static void main(String[] args) {

        User empolyee = new User("mikeSmith", "Mike", "Smith", Role.EMPLOYEE);

        System.out.println(empolyee);

        System.out.println(Unit.POUNDS.value);
        System.out.println("____________");
        System.out.println(Arrays.toString(Unit.values()));
    }
}
