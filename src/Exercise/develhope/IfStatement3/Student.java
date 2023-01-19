package Exercise.develhope.IfStatement3;

import java.util.Random;

public class Student {
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void guessingAge(){
        Random random= new Random();
        int randomAge= random.nextInt(35);
        System.out.printf("I generated the random number %d for Student %s %n" , randomAge, name);
        if(age==randomAge){
            System.out.println("Age and Random Value are Equals");
        }else if (age<randomAge){
            System.out.println("Age is lower than Random Value");
        }else{
            System.out.println("Age is higher than Random Value");
        }
    }
}
