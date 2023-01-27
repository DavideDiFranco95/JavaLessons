package Exercise.develhope.DateTime1;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class Start {
    public static void main(String[] args) {
        LocalDate actualDate=LocalDate.now();
        LocalDate endOfMonth=actualDate.withDayOfMonth(actualDate.lengthOfMonth());
        long daysBetween= DAYS.between(actualDate,endOfMonth);
        System.out.println("Days until the end of the Month: " + daysBetween);
        LocalDate endOfYear=actualDate.withDayOfYear(actualDate.lengthOfYear());
        long daysBetweenYear= DAYS.between(actualDate,endOfYear);
        System.out.println("Days until the end of the Year: " + daysBetweenYear);
    }
}
