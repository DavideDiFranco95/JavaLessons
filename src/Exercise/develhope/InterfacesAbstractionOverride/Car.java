package Exercise.develhope.InterfacesAbstractionOverride;

public class Car extends AbstractVehicle {
    int numberOfDoors;
    double carPrice;

    @Override
    public void showVehicleDetails(){
        super.showVehicleDetails();
        System.out.println("Doors: " + this.numberOfDoors);
    }

    @Override
    public void doVehicleSound() {
        System.out.println("Sound of the Car's engine start");
    }
    public Car(int numberOfWheels, int numberOfDoors, double carPrice){
        this.numberOfWheels=numberOfWheels;
        this.numberOfDoors=numberOfDoors;
        this.carPrice=carPrice;
        this.type="Fiat Punto";
    }
}
