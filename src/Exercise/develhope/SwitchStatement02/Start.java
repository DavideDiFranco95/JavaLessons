package Exercise.develhope.SwitchStatement02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Please enter a String: ");
            String string = scanner.nextLine();
            switch (string){
                case "size":
                    System.out.println("The List size is: " + list.size());;
                    break;
                case "clear":
                    list.clear();
                    break;
                case "print":
                    System.out.println("Sir, here the list! " + list);
                    break;
                default:
                    list.add(string);
                    break;
            }
        }
    }
}
