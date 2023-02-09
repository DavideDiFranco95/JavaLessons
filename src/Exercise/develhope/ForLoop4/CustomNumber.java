package Exercise.develhope.ForLoop4;


import java.util.Random;

public class CustomNumber {
    public int number;

    public CustomNumber() {
        Random random = new Random();
        this.number = random.nextInt(1,12);
        ;
    }
    public void getMultiplicationTable(){
        for (int i=12;i>=1;i--){

            System.out.println("multiplication of "
                    + number + " * " +i+" = " +(number*i));
        }
        System.out.println("The number is: " + number);
    }
}
