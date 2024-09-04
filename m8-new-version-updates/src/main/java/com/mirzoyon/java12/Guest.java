package com.mirzoyon.java12;

public class Guest {
    private String name;
    private boolean participating;
    private  Integer participantsNumOfFamilyMembers;

    public Guest(String name, boolean participating, Integer participantsNumOfFamilyMembers) {
        this.name = name;
        this.participating = participating;
        this.participantsNumOfFamilyMembers = participantsNumOfFamilyMembers;
    }

    public String getName() {
        return name;
    }

    public boolean isParticipating() {
        return participating;
    }

    public Integer getParticipantsNumOfFamilyMembers() {
        return participantsNumOfFamilyMembers;
    }
}
