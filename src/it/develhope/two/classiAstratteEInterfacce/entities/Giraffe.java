package it.develhope.two.classiAstratteEInterfacce.entities;

public class Giraffe extends AbstractAnimal {
    public Giraffe(){
        this.type="Giraffe";
    }
    @Override
    public void eat(){
        System.out.println("I am eating leaf");
    }

    @Override
    public void talk() {
        System.out.println("Talk Giraffe");
    }

    @Override
    public void drink() {
        System.out.println("Drink Giraffe");
    }
}
