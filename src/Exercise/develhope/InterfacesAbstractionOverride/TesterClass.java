package Exercise.develhope.InterfacesAbstractionOverride;

public class TesterClass {
    public static void main(String[] args) {
        Car car= new Car(4,5,13800);
        Boat boat= new Boat(65,350);

        car.showVehicleDetails();
        car.doVehicleSound();
        boat.doVehicleSound();
        boat.getBoatWeightAndSpeed();

    }
}
