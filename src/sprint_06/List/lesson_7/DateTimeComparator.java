package sprint_06.List.lesson_7;

import java.util.Comparator;

public class DateTimeComparator implements Comparator<DateTime> {

    @Override
    public int compare(DateTime dt1, DateTime dt2) {
        return Integer.compare(dt1.year, dt2.year);


    }
}