package com.cydeo.tasks;

public class PrimePredicate implements UnaryPredicate<Integer>{
    @Override
    public boolean test(Integer obj) {

        for (int i = 2; i <= 9; i++) {
            if (i == obj) continue;
            if (obj != 1 && obj % i == 0) return false;
        }

        return true;
    }
}
