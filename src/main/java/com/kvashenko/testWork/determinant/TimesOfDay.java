package com.kvashenko.testWork.determinant;

public enum TimesOfDay {
    MORNING(6),
    DAY(9),
    EVENING(19),
    NIGHT(23);

    private int hours;

    TimesOfDay(int hours) {
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }
}

