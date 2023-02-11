package Exercise.develhope.WhileLoop4;

import java.util.Random;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        int number;
        int userNumber;
        System.out.println("Welcome! try to guess the number: ");
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        number = random.nextInt(1,10);
        do {userNumber = input.nextInt();
        }while(userNumber != number);
            System.out.println("GG!");
    }
}
