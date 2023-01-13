package it.develhope.two.classiAstratteEInterfacce.entities;

public class Zookeeper {
    String name;
    public void feedAnimal(AbstractAnimal abstractAnimal){
        System.out.println("I am feeding the animal " + abstractAnimal.type);
        abstractAnimal.eat();
    }

    public void talkWithAnimal(IAnimal animal){
        animal.talk();
    }
    public void giveWaterToAnimal(IAnimal animal){
        animal.drink();
    }
    public void makeAnimalFly(IAnimalWhoFlies animal){
        animal.fly();
    }
}
