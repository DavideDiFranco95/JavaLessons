package it.develhope.WildCards;

public interface IUser {
    String getName();
    //A getStuff(); // se si mette a IUser<A>
    String getCompleteName();
    boolean isMale();

    void setName(String name);
}
