package sprint_06.List.lesson_7;

import java.util.Comparator;

public class DateTimeComparator implements Comparator<DateTime> {

    @Override
    public int compare(DateTime dt1, DateTime dt2) {


        int year = Integer.compare(dt1.year, dt2.year);
        if (year != 0) {
            return year;
        }

        int month = Integer.compare(dt1.month, dt2.month);
        if (month != 0) {
            return month;
        }

        int day = Integer.compare(dt1.day, dt2.day);
        if (day != 0) {
            return day;
        }

        int hours = Integer.compare(dt1.hours, dt2.hours);
        if (hours != 0) {
            return hours;
        }

        int minutes = Integer.compare(dt1.minutes, dt2.minutes);
        if (minutes != 0) {
            return minutes;
        }

        int seconds = Integer.compare(dt1.seconds, dt2.seconds);
        if (seconds != 0) {
            return seconds;
        }

        return 0;
    }
}