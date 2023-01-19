package Exercise.develhope.Encapsulation1;

public class TesterClass {
    public static String[] addResidentNames(){
        String[] residentNames={"Davide","Golia","Fabrizio"};
                return residentNames;
    }
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
        House house= new House(3,"Via degli Atenei 33/b",TesterClass.addResidentNames());
        TesterClass.printResidentNames(house);
    }
}
