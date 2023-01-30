package Exercise.develhope.arrays1;

import java.util.Arrays;

public class TesterClass {
    public static void main(String[] args) {
        String[] carBrands = {"Audi","BMW","Volkswagen","Porche","Ferrari"};

        System.out.println("Number of items on the Array: " + carBrands.length);
        System.out.println("3rd item of the Array: " + carBrands[2]);

        int[] primeNumbers = new int[6];

        primeNumbers[0]= 2;
        primeNumbers[1]= 3;
        primeNumbers[2]= 4;
        primeNumbers[3]= 5;
        primeNumbers[4]= 6;
        primeNumbers[5]= 1;

        System.out.println(Arrays.toString(primeNumbers));
    }
}
