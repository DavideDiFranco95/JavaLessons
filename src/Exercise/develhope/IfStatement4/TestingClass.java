package Exercise.develhope.IfStatement4;

public class TestingClass {
    public static void main(String[] args) {
        Person person=new Person();

        System.out.printf("The person is in the %s stage of Life" ,person.getLifeStage(person.age));
    }
}
