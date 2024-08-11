package com.cydeo.tasks;

import java.util.Arrays;

public class SwapValues {
    public static void main(String[] args) {

        Integer[] a = {1,2,3,4};
        String[] b = {"dog", "cat", "lion", "rat"};
        swap(a,0,2);
        swap(b, 1,3);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }

    private static <T> void swap(T[] arr, int i, int j){

        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
