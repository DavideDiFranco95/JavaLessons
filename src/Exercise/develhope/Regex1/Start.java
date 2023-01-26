package Exercise.develhope.Regex1;

public class Start {
    public static void main(String[] args) {
        String a = "I Like to code near the Lake with my friend Luke";

        System.out.println(a.replaceAll("[\sl,ke\s]*","BLA"));
    }
}