package com.cydeo.review;

import java.util.List;

public class MyUtils <T extends Person>{

    public void printInfo(List<T> list){
        for (T item : list){

            System.out.println((item));
        }
        System.out.println(list.size());
    }
    public  T getLastItem(List<T> list){
        return list.get(list.size()-1);
    }
}
