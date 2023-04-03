package org.dsa.problems.arrays;

public class Test {
    public static void main(String[] args) {
        Days today = Days.TUE;

        System.out.println(isToday(today));
    }

    private static int isToday(Days today) {
        var result = switch (today) {
            case MON -> 3;
            case TUE -> 4;
            case WED -> 5;
            case THU -> 1;
            case FRI -> 6;
            case SAT -> 9;
            case SUN -> 7;
            default -> 0;
        };
        return result;
    }

}

enum Days {
    MON, TUE, WED, THU, FRI, SAT, SUN;
}