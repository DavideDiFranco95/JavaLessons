package Exercise.develhope.Polymorphism2;

public class TesterClass extends Animal{
    public TesterClass(String animalName) {
        super(animalName);
    }

    public static void main(String[] args) {
        Animal animal1=new Animal("animal");
        Lion animal2=new Lion("Lion");
        Cow animal3=new Cow("Cow");

        System.out.println("Animal: " + animal1.animalName);
        animal1.animalSound();
        System.out.println("Animal: " + animal2.animalName);
        animal2.animalSound();
        System.out.println("Animal: " + animal3.animalName);
        animal3.animalSound();
    }
}
