package Exercise.develhope.InterfacesAbstractionOverride;

public abstract class AbstractVehicle {
    String type;
    int numberOfWheels;
    public void showVehicleDetails(){
        System.out.println("Type: " + this.type);
        System.out.println("Wheels: " + this.numberOfWheels);
    }
    public abstract void doVehicleSound();
}
