package Exercise.develhope.DateTime2;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Start {
    public static void main(String[] args) {
        ZonedDateTime dateTime = ZonedDateTime.now();
        ZoneId la = ZoneId.of("Europe/Rome");
        ZonedDateTime date2 = dateTime.withZoneSameInstant(la);


        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd-MMM-yy HH:mm");
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("dd/MM/yyyy - hh:mm");



        System.out.println("The First Format is: " + dateTime.format(f1));
        System.out.println("The Second Format is: " + date2.format(f2));
    }
}
