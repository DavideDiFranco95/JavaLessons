package Exercise.develhope.Annotations01;

public class Start {

    public static void main(String[] args) {
        Car car = new Car("Fiat Punto",138640);
        //noinspection removal
        car.printCarDetails();
        car.getCarDetails();
    }
}
