package Exercise.develhope.Polymorphism2;

public class Cow extends Animal{
    public Cow(String animalName) {
        super(animalName);
    }

    @Override
    public void animalSound() {
        System.out.println("Mooooo!");
    }
}
