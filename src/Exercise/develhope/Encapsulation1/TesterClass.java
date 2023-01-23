package Exercise.develhope.Encapsulation1;

import java.util.Arrays;
import java.util.Scanner;

public class TesterClass {

    public static void printResidentNames(House house){
        /**
         * Per printare i nomi divisi
         * ForEach method
         */
        for (String var : house.getResidentNames())
        {
            String a=String.format("Number of floors: %s , Address of the House %s , Resident of the House %s",
                    house.getFloorNumbers(),house.getAddress(),var);
            System.out.println(a);
        }

    }
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        int floor= scanner.nextInt();
        scanner.nextLine();
        String address= scanner.nextLine();
        String[] residents= scanner.nextLine().split(",");
        House house1=new House(floor,address,residents);
        System.out.println(house1.getFloorNumbers());
        System.out.println(house1.getAddress());
        System.out.println(Arrays.toString(house1.getResidentNames()));
        printResidentNames(house1);
    }
}
