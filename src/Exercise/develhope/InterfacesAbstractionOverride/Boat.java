package Exercise.develhope.InterfacesAbstractionOverride;

public class Boat extends AbstractVehicle{
    double maxKnotsSpeed;
    int boatKilosWeight;
    @Override
    public void doVehicleSound() {
        System.out.println("Sound of the Boat's engine start");
    }

    public Boat(double maxKnotsSpeed,int boatKilosWeight){
        this.maxKnotsSpeed=maxKnotsSpeed;
        this.boatKilosWeight=boatKilosWeight;
    }
    public void getBoatWeightAndSpeed(){
        System.out.println("The Max Knots Speed is: " + maxKnotsSpeed);
        System.out.println("The boat kilos weight is: " + boatKilosWeight);
    }
}
