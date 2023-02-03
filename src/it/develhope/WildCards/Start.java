package it.develhope.WildCards;

import java.util.ArrayList;
import java.util.List;

public class Start {
    public static void main(String[] args) {
        System.out.println("START");
        List<Car> myList = new ArrayList<>();
        myList.add(new Car());
        Car car = myList.get(0);

        List myListGeneric = new ArrayList<>();
        myListGeneric.add(new Car());
        myListGeneric.add(new UserFromDB());
        myListGeneric.add("This is a String");

        //List<? extends IUser> listUser = new ArrayList<>();
        //listUser.add(new UserFromDB());
        // Non si può fare perchè lo abbiamo reso disponibile solo alle classi
        //che implementano IUser e ad IUser stesso.
        List<? super IUser> listUser = new ArrayList<>();
        listUser.add(new UserBase());
        listUser.add(new UserBase());
        IUser singleIUser = (IUser) listUser.get(0); //(IUser) = forzare.

        //Se la classe che usiamo ha un implements o extends si usa super
        //altrimenti si usa extends.
        List<? super UserBase> listUserBase = new ArrayList<>();
        listUserBase.add(new UserFromDB());

        System.out.println("--------------------------------------");
        Factory myFactory = new Factory();
        myFactory.employee = new UserFromDB("Lorenzo", "DF",30,true);
        myFactory.printEmployee();

        UserFromDB lorenzo = new UserFromDB("Lorenzo", "DF",30,true);
        System.out.println(lorenzo.name);
        lorenzo = setNameToUser(lorenzo, "Nuovo nome bellissimo");
        System.out.println(lorenzo.name);
    }

    public static <T extends IUser> T setNameToUser(T user,String name){
        user.setName(name);
        return user;
    }

    public static void doStuffWithFactory(Factory<?> factory){ //generico. prende tutto.
        factory.employee.getCompleteName();
    }
}
