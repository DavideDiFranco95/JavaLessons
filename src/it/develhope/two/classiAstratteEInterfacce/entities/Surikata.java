package it.develhope.two.classiAstratteEInterfacce.entities;

public class Surikata extends AbstractAnimal {
    @Override
    public void eat(){
        System.out.println("I don't know what to eat");
    }

    @Override
    public void talk() {
        System.out.println("Talk Surikata");
    }

    @Override
    public void drink() {
        System.out.println("I am the Surikata and I am drinking");
    }
}
