package Exercise.develhope.WhileLoop3;

public class Start {
    public static void main(String[] args) {
        boolean foundFibonacci = false;
        int maxNumber = 60;
        int previousNumber = 0;
        int nextNumber = 1;

        System.out.print("Fibonacci Series of " + maxNumber + " numbers:");
        while(!foundFibonacci && nextNumber<maxNumber){
            System.out.print(previousNumber + " ");
            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
        }
        System.out.println("\n" + "------------------");
    }
}
