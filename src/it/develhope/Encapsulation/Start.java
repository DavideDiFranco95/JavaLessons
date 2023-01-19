package it.develhope.Encapsulation;
public class Start {
    public static void main(String[] args) {
        User u= new User();
        u.setId("123456");
        u.setEmail("123@gmail.com");
        u.setPassword("sadadsad-dsadadsa-asdasd-dasdasdas-f");
        u.setAddress("Via Delle Palme, 15");
        u.setName("Lorenzo");
        u.setSurname("DF");

        System.out.println(u);

        System.out.println("The car is -------------------");
        Car car=new Car(120,5,16,3200);
        car.setDoors(15);
        System.out.println(car.toString());
    }
}
