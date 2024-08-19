package com.cydeo;

import java.util.ArrayList;
import java.util.List;


public class Team <T extends Player> {  ////Any class you can pass to Team. Should accept only Player class and subclasses


    private String name;
    private List<T> members = new ArrayList<>();

    public String getName() {
        return name;
    }

    public Team(String name) {
        this.name = name;
    }
    public boolean addPlayer(T player){
        if (members.contains(player)){
            System.out.println(player.getName() + " This player is already on the team");
            return false;
        }else {
            members.add(player);
            System.out.println(player.getName() + " Player has been added to the team");
            return true;
        }
    }

}
