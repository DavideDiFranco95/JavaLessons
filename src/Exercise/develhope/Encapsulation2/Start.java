package Exercise.develhope.Encapsulation2;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String name=scanner.nextLine();
        String surname=scanner.nextLine();
        double height= scanner.nextDouble();
        int age= scanner.nextInt();
        System.out.printf("Name: %s ",name);
        System.out.printf("Surname: %s ",surname);
        System.out.printf("Height: %f ",height);
        System.out.printf("Age: %d ",age);
    }
}
