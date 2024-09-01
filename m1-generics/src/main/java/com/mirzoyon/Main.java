package com.mirzoyon;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> items = new ArrayList<>(); //ArrayList only accepts objects belong to Integer class


        items.add(1);
        items.add(2);
        items.add(3);
        items.add(6);
        items.add(5);
       /// items.add("Peach");

        printDoubled(items);

        System.out.println("----------------------------------");

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer messi = new SoccerPlayer("Messi");

        Team<SoccerPlayer> liverpool = new Team<>("Liverpool");

       /// liverpool.addPlayer(joe);
       /// liverpool.addPlayer(pat);
        liverpool.addPlayer(messi);



    }

    private static void printDoubled(ArrayList<Integer> items) {
        for (Integer i : items) {
            System.out.println(i * 2);
        }
    }
}
