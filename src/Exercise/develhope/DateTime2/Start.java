package Exercise.develhope.DateTime2;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Start {
    public static void main(String[] args) {
        LocalDateTime dateTime= LocalDateTime.now();


        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd-MMM-yy HH:mm");
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm ");

        System.out.println("The First Format is: " + dateTime.format(f1));
        System.out.println("The Second Format is: " + dateTime.format(f2));
    }
}
