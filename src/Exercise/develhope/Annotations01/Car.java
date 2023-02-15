package Exercise.develhope.Annotations01;

public class Car {
    public String modelName;
    public double mileage;

    public Car(String modelName, double mileage) {
        this.modelName = modelName;
        this.mileage = mileage;
    }


    @Deprecated (since ="printCarDetails is too long", forRemoval = true )
    public void printCarDetails(){
        System.out.println("Model Name of the Car : " + modelName + " "
                + "Mileage of the Car : " + mileage);
    }
    public void getCarDetails(){
        System.out.println("Model Name of the Car : " + modelName);
        System.out.println("Mileage of the Car : " + mileage);
    }
}
