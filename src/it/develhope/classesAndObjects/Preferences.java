package it.develhope.classesAndObjects;

public class Preferences {

    public static final Preferences preferences = new Preferences();

    public final int maxPlacesInGarage= 100;
    public final String garageName= "My Garage";
    private Preferences(){}

    public static Preferences getInstance(){
        return preferences;
    }
}
