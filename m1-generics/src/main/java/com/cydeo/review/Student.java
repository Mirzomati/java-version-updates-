package com.cydeo.review;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Student extends Person{

    private String name;
    private final int id;
}
