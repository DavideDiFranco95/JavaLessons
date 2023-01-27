package it.develhope.Date;
import java.time.LocalDate;
import java.util.Date;
import java.time.LocalTime;

public class Time {
    public static void main(String[] args) {
        LocalTime time= LocalTime.now();
        //orario corrente del Sistema

        System.out.println("Tempo reale "+time);
        //Stampa l'intero orario
        System.out.println("Ora attuale "+time.getHour());
        //Stampa l'Ora corrente
        System.out.println("Minuto attuale "+time.getMinute());
        //Stampa i Minuti correnti
        System.out.println("Secondo attuale "+time.getSecond());
        //Stampa i Secondi correnti
        System.out.println("Nano Secondo attuale "+time.getNano());
        //Stampa i NanoSecondi correnti

        //Cambio orario
        LocalTime time2=LocalTime.now().plusHours(1).plusMinutes(2)
                .plusSeconds(3);
        System.out.println("Tempo Distorto "+time2);

        System.out.println("Ora Distorto "+time2.getHour());

        System.out.println("Minuto Distorto "+time2.getMinute());

        System.out.println("Secondo Distorto "+time2.getSecond());

        System.out.println("Nano Secondo Distorto "+time2.getNano());

        System.out.println("--------------Date----------------");

        Date myDate= new Date();
        Date myDate2= new Date(2022,11,13,00,00,00);
        long myDateTime=myDate.getTime();
        long Date2Time= myDate2.getTime();
        long diffInMs= myDateTime - Date2Time;
        System.out.println("Diff in MS " + diffInMs);

        System.out.println("--------------Between----------------");
        LocalDate date1=LocalDate.of(2021,04,10);
        LocalDate date2=LocalDate.of(2024,11,10);
        LocalDate dateBetween=LocalDate.now();
        if (date1.isBefore(dateBetween) && date2.isAfter(dateBetween)){
            System.out.println("The Date is between "+ date1 + " and " + date2 );
        }else{
            System.out.println("The Date is outside");
        }

    }
}
