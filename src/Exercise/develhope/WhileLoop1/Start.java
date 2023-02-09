package Exercise.develhope.WhileLoop1;


import static java.lang.Thread.sleep;

public class Start {
    public static void main(String[] args) {
        String string = "I am in loop";
        while (true) {
            System.out.println(string);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

}
