package Exercise.develhope.IfStatement4;

import java.util.Random;

public class Person {
    public int age;

    public Person() {
        int min=5;
        int max=80;
        double randomMathDouble=Math.floor(Math.random()*(max-min+1)+min);
        int randomMath= (int) randomMathDouble;
        this.age=randomMath;
    }
    public String getLifeStage(int age){
        if(age<=12){
            return " Child ";
        } else if (age<=19) {
            return " Teen ";
        } else if (age<=59) {
            return " Adult";
        }else{
            return " Senior Adult ";
        }
    }
}
