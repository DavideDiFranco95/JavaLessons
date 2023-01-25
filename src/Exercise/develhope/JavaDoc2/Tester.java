package Exercise.develhope.JavaDoc2;

/**
 * @author Davide Di Franco
 */
public class Tester {
    public static void main(String[] args) {
        ArithmeticOperators arithmeticOperators= new ArithmeticOperators();
        System.out.println(arithmeticOperators.sum(1,2));
        System.out.println(arithmeticOperators.sub(2,3));
        System.out.println(arithmeticOperators.mul(2,2));
        System.out.println(arithmeticOperators.div(3,2));
    }
}
