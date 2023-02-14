package Exercise.develhope.ExceptionsHandling01;

public class Start {
    public static void main(String[] args) throws Exception {
        Score score1 = new Score();
        //valori da testare: 2.15,50,95.02,100.01
        try{
            score1.checkScore(100.01);
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
    }
}
