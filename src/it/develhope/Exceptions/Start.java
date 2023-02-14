package it.develhope.Exceptions;

import java.util.Locale;

public class Start {
    public static void main(String[] args) {
        String a = "null";
        try{
            System.out.println(a.toLowerCase(Locale.ROOT));
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("An Exception has occurred");
        }finally {
            System.out.println(" ----------- This runs everytime --------------");
        }

        System.out.println("-----------------------------------------------");

        User user = new User();
        try {
            user.setAge(-15);
            System.out.println("Success");
        }catch (ZeroAgeException e){
            System.out.println("Validation Error, age is 0");
        }catch (AgeException e){
            System.out.println("Validation Error,you put: " + e.inputAge);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("An exception has occurred in setting age user.setAge");
        }

        System.out.println("-----------------------------------------------");

        try {
            user.validateData();
        } catch (AgeException e) {
            System.out.println("Validation Error,you put: " + e.inputAge);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("An Exception has occurred in setting age user.setAge");
        }
        System.out.println("-----------------------------------------------");


    }
}
