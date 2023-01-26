package Exercise.develhope.Regex4;

public class Start {
    public static void main(String[] args) {
        String string1= "x3z ? xYz ! R1 && __";
        System.out.println(string1.replaceAll(("[a-z|0-9]"),"*"));
    }
}
