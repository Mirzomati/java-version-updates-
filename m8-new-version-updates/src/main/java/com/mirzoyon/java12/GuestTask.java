package com.mirzoyon.java12;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GuestTask {


    public static void main(String[] args) {

        var result =
                    Stream.of(
                                new Guest("Marco", true, 3),
                                new Guest("David", false, 2),
                                new Guest("Roger", true, 6))
                        .collect(Collectors.teeing(
                                // first Collector, we get only those who are confirmed the participation, then get their first names
                                Collectors.filtering(Guest::isParticipating, Collectors.mapping(Guest::getName, Collectors.toList())),
                                // Second collector, we want the total number of participants
                                Collectors.filtering(Guest::isParticipating, Collectors.summingInt(Guest::getParticipantsNumOfFamilyMembers)), EventParticipation::new));

        System.out.println(result);

    }
}