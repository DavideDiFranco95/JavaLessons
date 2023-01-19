package Exercise.develhope.IfStatement2;

public class Start {
    public static void main(String[] args) {
        String mySurname="Di Franco";
        String result= mySurname.contains("ni") ? "contain 'ni'" : "doesn't contain 'ni'";
        System.out.println("Your surname " + result);
    }
}
