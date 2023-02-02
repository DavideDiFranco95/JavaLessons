package Exercise.develhope.Lists1;

import java.util.*;



public class TestingClass {
    public static void main(String[] args) {
        List<String> cityNames = Arrays.asList("Castrovillari","Roma","Catania");
        Collections.unmodifiableList(cityNames);

        //java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        //cityNames.set(3,"Londra");
        cityNames.set(1,"Tegucigalpa");
        System.out.println(cityNames);

        List<String> kingsOfRome = new ArrayList<>();
        kingsOfRome.add("Romolo");
        kingsOfRome.add("Numa Pompilio");
        kingsOfRome.add("Tullo Ostilio");
        kingsOfRome.add("Anco Marco");
        kingsOfRome.add("Tarquinio Prisco");
        kingsOfRome.add("Servio Tullio");
        kingsOfRome.add("Tarquinio il Superbo");

        String[] kingsOfRomeArray= kingsOfRome.toArray(new String[0]);

        kingsOfRomeArray[6] = "Lucius Tarquinius Supercar";
        System.out.println(Arrays.toString(kingsOfRomeArray));
    }
}
