package com.cydeo.java9;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface PrivateInterface {

    boolean isHoliday(LocalDate date);
    default boolean isBusinessDay(LocalDate date){
       /* if(date.isBefore(LocalDate.of(2001,1,1))){
            throw new IllegalArgumentException();
        }*/
        validDate(date);
        return !isHoliday(date);
    }

    default LocalDate nextDay(LocalDate date){
       /* if(date.isBefore(LocalDate.of(2001,1,1))){
            throw new IllegalArgumentException();
        }*/
        validDate(date);
        LocalDate nextDate = date.plusDays(1);
        return isHoliday(nextDate)? nextDay(nextDate):nextDate;
    }

    // with private can make internal method to use in other methods for clean and efficient code
    private void validDate(LocalDate date){
        if(date.isBefore(LocalDate.of(2001,1,1))){
            throw new IllegalArgumentException();
        }
    }
}
