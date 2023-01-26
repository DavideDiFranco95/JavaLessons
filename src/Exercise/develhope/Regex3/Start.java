package Exercise.develhope.Regex3;

public class Start {
    public static void main(String[] args) {
        String string1=  "are you able to climb, are you able to swim or are you able to fly?";
        System.out.println(string1.replaceAll("\s+are","_xyz"));
    }
}
