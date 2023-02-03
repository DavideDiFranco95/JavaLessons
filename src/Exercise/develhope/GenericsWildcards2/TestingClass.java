package Exercise.develhope.GenericsWildcards2;

public class TestingClass {
    public static void main(String[] args) {
        GenericsClass <Integer> genericsClass1 = new GenericsClass();
        GenericsClass <Integer> genericsClass2 = new GenericsClass();
        GenericsClass <String> genericsClass3 = new GenericsClass();
        GenericsClass <String> genericsClass4 = new GenericsClass();

        genericsClass1.setT(12);
        genericsClass2.setT(13);
        genericsClass3.setT("This is a String");
        genericsClass4.setT("This is a String");

        System.out.println(genericsClass1.isEqual(genericsClass1,genericsClass2));
        System.out.println(genericsClass3.isEqual(genericsClass3,genericsClass4));
        System.out.println("-----------------");
    }
}
