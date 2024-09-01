package com.mirzoyon.java9;

import java.time.LocalDate;

public interface PrivateMethodInterface {

    boolean isHoliday(LocalDate date);

    ///before private methods

    default boolean isBusinessDay(LocalDate date){
        if(date.isBefore(LocalDate.of(2001, 1, 1))){
            throw  new IllegalArgumentException();
        }
        return !isHoliday(date);
    };

    ///after private methods
    default LocalDate nextDay(LocalDate date){
        validate(date);
        LocalDate nextDate = date.plusDays(1);
        return isHoliday(nextDate) ? nextDay(nextDate): nextDate;
    }
//////////////////////////////////////////

    private void validate(LocalDate date){
        if(date.isBefore(LocalDate.of(2001,1, 1))){
            throw  new IllegalArgumentException();
        }
    }

}
