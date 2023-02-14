package it.develhope.Exceptions;

public class AgeException extends Exception{
    int inputAge;
    AgeException(int inputAge){
        this.inputAge = inputAge;
    }

    @Override
    public String getMessage() {
        //return super.getMessage(); //così va bene, oppure
        return "The Age set was not correct,you put: " + inputAge; //custom :D
    }
}
