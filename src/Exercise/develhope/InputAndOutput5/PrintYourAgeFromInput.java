package Exercise.develhope.InputAndOutput5;

import java.util.Scanner;

public class PrintYourAgeFromInput {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //System.out.print("task 1: remove this comment and write one line of code here" + "\n");
        int age=input.nextInt();
        System.out.printf("Enter your age: %d %n",age);
        //System.out.print("task 2: remove this comment and write one line of code here"+ "\n");
        input.close();
        System.out.printf("Your age is: %d",age);
    }
}
