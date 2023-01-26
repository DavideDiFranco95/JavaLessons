package Exercise.develhope.StringHandling3;


import java.util.Arrays;

public class Start {
    public static void main(String[] args) {
        String[] array1 = {
                " I want ",
                " to learn ",
                " how to code! "
        };

        String[] array2 = {
                array1[0].trim(),
                array1[1].trim(),
                array1[2].trim(),
        };
        System.out.println(Arrays.toString(array2));
        System.out.println(array2[0]);
        System.out.println(array2[1]);
        System.out.println(array2[2]);

        boolean b = !(array2[0].compareTo("I want") > array2[1].compareToIgnoreCase("To learn"));
        System.out.println(Arrays.toString(array2).replaceAll("\\s", ""));
        System.out.println(b);
    }
}
