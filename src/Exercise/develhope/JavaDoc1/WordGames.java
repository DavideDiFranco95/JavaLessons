package Exercise.develhope.JavaDoc1;
/**
 * @author Davide Di Franco
 */
public class WordGames {
    String name="Davide";
    String surname=" Di Franco";
    String word= "Word";

    /**
     * method for "Hello Word"
     * @param word a string that will print "word"
     * @return will return the entire print
     */
    public String addHelloWord(String word){
        return "Hello" + word;
    }

    /**
     * method for print full name
     * @param name print the name
     * @param surname print the surname
     * @return the full name
     */
    public void getFullName(String name,String surname){
        System.out.println(name + surname);
    }

}
