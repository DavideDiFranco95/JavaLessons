package it.develhope.classesAndObjects;

public class Car {
    public String model;
    public int wheelNumber;
    public String color;
    public boolean isCabrio;
    public Door frontDoorLeft;
    public Door frontDoorRight;
    public Door rearDoorLeft;
    public Door rearDoorRight;

    public String print(){
        return isCabrio + " - " + model + " - " + wheelNumber + " - " + color;
    }
}
