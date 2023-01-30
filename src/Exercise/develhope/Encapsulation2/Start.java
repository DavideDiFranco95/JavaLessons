package Exercise.develhope.Encapsulation2;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Person p1= new Person();
        Scanner scanner= new Scanner(System.in);
        p1.setName(scanner.nextLine());
        p1.setSurname(scanner.nextLine());
        p1.setHeight(scanner.nextDouble());
        p1.setAge(scanner.nextInt());

        System.out.println(p1);

    }
}
