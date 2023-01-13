package it.develhope.two.classiAstratteEInterfacce.entities;

public class Eagle extends AbstractAnimal implements IAnimal, IAnimalWhoFlies, IAnimalWhoEat {
    @Override
    public void eat(){

    }

    @Override
    public void talk() {

    }

    @Override
    public void drink() {

    }

    @Override
    public void fly() {
        System.out.println("Eagle - I am flying");
    }
}
