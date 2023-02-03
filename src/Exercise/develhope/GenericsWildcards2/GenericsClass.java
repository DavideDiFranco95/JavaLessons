package Exercise.develhope.GenericsWildcards2;

public class GenericsClass <T>{
    private T t;


    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
    public static <T> boolean isEqual(T gc1, T gc2){
        return gc1.equals(gc2);
    }

}
