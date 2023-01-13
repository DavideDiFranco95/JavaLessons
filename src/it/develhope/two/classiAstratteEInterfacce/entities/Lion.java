package it.develhope.two.classiAstratteEInterfacce.entities;

public class Lion extends AbstractAnimal {
    public Lion(){
        this.type="Lion";
    }
    @Override
    public void eat(){
        System.out.println("I am eating meat");
    }

    @Override
    public void talk() {
        System.out.println("Roarrrrrrr");
    }

    @Override
    public void drink() {
        System.out.println("Drink Lion");
    }
}
