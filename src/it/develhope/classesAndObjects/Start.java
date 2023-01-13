package it.develhope.classesAndObjects;

public class Start {
    public static void main(String[] args) {
        System.out.println("Start - main");

        Preferences preferences =Preferences.getInstance();
        System.out.println(" -- " + preferences.maxPlacesInGarage + " -- ");
        System.out.println(" -- " + preferences.garageName + " -- ");

        System.out.println("Max places in my garage " + Garage.maxPlaces);
        Car mini= new Car(); //l'uguale con "new Car();" è un instanza
        mini.isCabrio= false;
        mini.model= "MINI COOPER D";
        mini.wheelNumber= 4;
        mini.color= "Grey";

        Door door1= new Door();
        door1.isElectricDoor= true;
        door1.color= "Red";
        door1.hasKeyAccess= true;
        door1.isElectricWindow= true;

        Door door2= new Door();
        door2.isElectricDoor= true;
        door2.color= "Red";
        door2.hasKeyAccess= true;
        door2.isElectricWindow= true;


        /*Door door3= new Door();
        door3.isElectricDoor= true;
        door3.color= "Red";
        door3.hasKeyAccess= true;
        door3.isElectricWindow= true;

        Door door4= new Door();
        door4.isElectricDoor= true;
        door4.color= "Red";
        door4.hasKeyAccess= true;
        door4.isElectricWindow= true;*/

        /*mini.frontDoorLeft= door1;
        mini.frontDoorRight= door2;
        mini.rearDoorLeft= door3;
        mini.rearDoorRight= door4;*/

        mini.frontDoorLeft= door1;
        mini.frontDoorRight= door1;
        mini.rearDoorLeft= door2;
        mini.rearDoorRight= door2;

        //door3.color= "Blue";
        mini.rearDoorRight.color= "Blue";

        System.out.println("------------------------------");
        System.out.println("Mini " + mini.print());
        mini.frontDoorLeft.print();
        mini.frontDoorRight.print();
        mini.rearDoorLeft.print();
        mini.rearDoorRight.print();
        System.out.println("------------------------------");

        Car audi= new Car();
        audi.isCabrio= true;
        audi.model="A3";
        audi.wheelNumber= 4;
        audi.color= "Black";

        /*System.out.println("Mini " + mini.isCabrio + " - " + mini.model + " - " + mini.wheelNumber + " - " + mini.color);
        System.out.println("Audi " + audi.isCabrio + " - " + audi.model + " - " + audi.wheelNumber + " - " + audi.color);
        System.out.println("--------------------------");
        audi.model="A6"; //nuova variabile
        System.out.println("Audi " + audi.isCabrio + " - " + audi.model + " - " + audi.wheelNumber + " - " + audi.color);
         */
        System.out.println("Audi " + audi.print());
        System.out.println("MINI " + mini.print());

        //CarStatic fiat= new CarStatic();
        //CarStatic toyota= new CarStatic();
        Garage.maxPlaces = 586;
        System.out.println("Max places in my garage after processes " + Garage.maxPlaces);
    }
}

