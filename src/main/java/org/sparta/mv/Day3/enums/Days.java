package org.sparta.mv.Day3.enums;

import java.util.Arrays;

public enum Days {
    MONDAY("Today is MONDAY"),
    TUESDAY("Today is TUESDAY"),
    WEDNESDAY("Today is WENESDAY"),
    THURSDAY("Today is THURSDAY"),
    FRIDAY("Today is FRIDAY"),
    SATURDAY("Today is SATURDAY"),
    SUNDAY("Today is SUNDAY");

    private String name;

    Days(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Days myDayObject = Days.WEDNESDAY;
        Days myDayObject2 = Days.THURSDAY;
        System.out.println(myDayObject.name());
        System.out.println(myDayObject.compareTo(myDayObject2));
        System.out.println(Arrays.toString(Days.values()));
    }
}
