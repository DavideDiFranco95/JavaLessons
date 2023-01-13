package it.develhope.two.classiAstratteEInterfacce;

import it.develhope.two.classiAstratteEInterfacce.entities.*;

public class Start {
    public static void main(String[] args) {
        System.out.println("------ Start the Zoo ------");

        AbstractAnimal abstractAnimal = new AbstractAnimal(){
            @Override
            public void talk() {

            }

            @Override
            public void drink() {

            }

            @Override
            public void eat(){
                System.out.println("This animal eat all the stuff");
            }
        };
        abstractAnimal.name = "Zebra";

        Giraffe giraffe = new Giraffe();
        Lion lion = new Lion();
        Penguin penguin = new Penguin();
        Eagle eagle = new Eagle();
        System.out.println("Animal Name "+ giraffe.type);

        Zookeeper zookeeper = new Zookeeper();
        zookeeper.feedAnimal(eagle);
        zookeeper.feedAnimal(giraffe);
        zookeeper.feedAnimal(lion);
        zookeeper.feedAnimal(penguin);

        zookeeper.talkWithAnimal(eagle);
        zookeeper.talkWithAnimal(giraffe);
        zookeeper.talkWithAnimal(lion);
        zookeeper.talkWithAnimal(penguin);
        zookeeper.makeAnimalFly(eagle);


    }
}
