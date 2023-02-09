package Exercise.develhope.WhileLoop2;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {


        String a;
        String stop = "Stop";
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Please enter a command: ");
            a= scanner.nextLine();
            if (a.equals(stop)){
                break;
            }
        }
    }
}
