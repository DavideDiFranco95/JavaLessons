package Exercise.develhope.OtherOperators;

public class TestingClass {
    public static void main(String[] args) {

        int a = 15;
        a+=5;
        a-=4;
        int b=++a;
        System.out.println("value of B = " + b);
        String check = (b%2==0) ? "Even" : "Odd";
        System.out.println("The number of B is " + check);

        String check2 = ((b*(b+1))%3==0) ? "Multiple of 3" : "Not multiple of 3";
        System.out.println("The number of B multiplied by B+1 is " + check2);

    }
}
