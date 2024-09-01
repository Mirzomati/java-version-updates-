package com.mirzoyon.review;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Teacher extends Person {

    private String name;
    private final int id;
}
