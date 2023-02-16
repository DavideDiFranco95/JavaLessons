package Exercise.develhope.Annotations01;

public class Start {

    public static void main(String[] args) {
        Car car = new Car("Fiat Punto",138640);
        @SuppressWarnings("deprecation")
        String carDetails1 = car.printCarDetails();
        car.getCarDetails();

    }
}
