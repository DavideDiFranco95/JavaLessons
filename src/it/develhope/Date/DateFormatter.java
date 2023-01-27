package it.develhope.Date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormatter {
    public static void main(String[] args) {
        LocalDateTime time= LocalDateTime.now();
        //data e tempo corrente del Sistema

        System.out.println("Not formatted: " + time);

        DateTimeFormatter f1=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        DateTimeFormatter f2=DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm ");

        System.out.println("f1 format: " + time.format(f1));
        System.out.println("f2 format: " + time.format(f2));
    }
}
