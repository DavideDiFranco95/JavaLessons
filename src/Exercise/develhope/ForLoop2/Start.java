package Exercise.develhope.ForLoop2;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {

        //Without Scanner

        int maxNumber = 10;
        int previousNumber = 0;
        int nextNumber = 1;

        System.out.print("Fibonacci Series of " + maxNumber + " numbers:");

        for (int i = 1; i <= maxNumber; ++i) {
            System.out.print(previousNumber + " ");
            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
        }


    }
}