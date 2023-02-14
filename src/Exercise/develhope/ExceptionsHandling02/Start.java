package Exercise.develhope.ExceptionsHandling02;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("insert a dividend: " );
        int dividend = scanner.nextInt();
        System.out.println("insert a divisor: " );
        int divisor = scanner.nextInt();
        while(true){

            try{
                int quotient = dividend / divisor;
                System.out.println("The quotient is: " + quotient);
                System.out.println("insert a dividend: " );
                dividend = scanner.nextInt();
                System.out.println("insert a divisor: " );
                divisor = scanner.nextInt();
            }catch(ArithmeticException e) {
                e.printStackTrace();
                System.out.println("Cannot divide by Zero");
            }
        }
    }
}
