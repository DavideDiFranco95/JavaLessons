package Exercise.develhope.ClassesAndObjects01;

public class TestProgrammers {
    public static void main(String[] args) {
        System.out.println("---------ES:1---------");
        Programmer programmer1= new Programmer();
        programmer1.name="Davide";
        programmer1.age=27;
        programmer1.wearsGlasses=true;
        programmer1.drinkCoffee();

        System.out.println("Programmer1 " + programmer1.printDetails());
        System.out.println("Programmer1 " + programmer1.drinkCoffee());

        Programmer programmer2=new Programmer();
        programmer2.name="Fabrizio";
        programmer2.age=34;
        programmer2.wearsGlasses=false;
        programmer2.drinkCoffee();

        System.out.println("Programmer2 " + programmer2.printDetails());
        System.out.println("Programmer2 " + programmer2.hasGlasses());
    }


}
