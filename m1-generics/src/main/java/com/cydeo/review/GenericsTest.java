package com.cydeo.review;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest {


    public static void main(String[] args) {


        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Mike", 101));
        studentList.add(new Student("Joe", 102));
        studentList.add(new Student("Adam", 103));

        List<Teacher> teacherList = new ArrayList<>();

        teacherList.add(new Teacher("Albus", 201));
        teacherList.add(new Teacher("Severus", 202));

//        printInfo(studentList);
////        printInfo(teacherList);

//        printInfo2(studentList);
//        printInfo2(teacherList);

//        System.out.println(getLastItem(studentList));
//        System.out.println(getLastItem(teacherList));

        System.out.println("_______________________________________________________________");

        MyUtils<Student> obj1 = new MyUtils<>();
        obj1.printInfo(studentList);
        System.out.println(obj1.getLastItem(studentList));

    }

    // Write a method that takes a list of students, prints each student and the total student count.

    public static void printInfo(List<Student> list){
        for (Student student:list){
            System.out.println(student);
        }

        System.out.println(list.size());
    }
    // Write a method that takes a list, prints each item in it and its total item count.
    public static <T extends Person> void printInfo2(List<T> list){
        for (T item:list){
            System.out.println(item);
        }

        System.out.println(list.size());
    }
    // Write a method that takes a list and returns the last item of the list.
    public static <T> void lastItem(List<T> list){
        System.out.println(list.size()-1);
    }
}
