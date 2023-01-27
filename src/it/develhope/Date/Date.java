package it.develhope.Date;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Date {
    public static void main(String[] args) {
        LocalDate todaysDate= LocalDate.now();
        LocalDate tomorrowDate= LocalDate.now();
        tomorrowDate=tomorrowDate.plus(1, ChronoUnit.DAYS)
                .plus(1,ChronoUnit.MONTHS);
        tomorrowDate=todaysDate.plusDays(1)
                .plusYears(2).plusMonths(3);
        //LocalDate è la classe di appartenenza, data da Java.
        //LocalDate.now darà la data corrente che abbiamo sul sistema.
        //plus aggiunge
        //ChronoUnit.DAYS ISO che rappresenta i Giorni. c'è anche dei mesi e degli anni ecc
        //Riga 10-12 cambiano le Date
        System.out.println("Day "+todaysDate);
        //Stampa la Data completa
        System.out.println("Month "+todaysDate.getMonth());
        //Stampa il Mese corrente
        System.out.println("Month number "+todaysDate.getMonthValue());
        //Stampa il Mese corrente a numero
        System.out.println("Actual Day of the Month "+todaysDate.getDayOfMonth());
        //Stampa il Giorno corrente del Mese
        System.out.println("Year "+todaysDate.getYear());
        //Stampa l'Anno corrente
        System.out.println("Total Days of the Month "+todaysDate.lengthOfMonth());
        //Stampa quanti giorni ci sono nel Mese attuale

        System.out.println("Tomorrow Day of Week number "+tomorrowDate.getDayOfWeek().ordinal());
        System.out.println("Tomorrow Day "+ tomorrowDate.getDayOfMonth());
        System.out.println("Tomorrow Month "+tomorrowDate.getMonth());
        System.out.println("Tomorrow Year "+tomorrowDate.getYear());

        LocalDate oldDate= LocalDate.of(1990,1,8);
        //aaaa-mm-dd
        System.out.println(oldDate.isBefore(todaysDate));
        //darà True (Visto che isBefore è un BOOLEAN) è prima
        System.out.println(oldDate.isAfter(todaysDate));
        //darà False perchè non è dopo la Data corrente

    }
}
