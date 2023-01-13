package it.develhope.Accessibility.entities;

public class User {
    public String name; //Bad usage
    public String surname;
    public String evaluateType;
    protected String type;

    private boolean isAdmin = false;

    public void doStuff(){

    }
    public void doStuff2(){
        this.auxiliaryMethod();
    }
    private void auxiliaryMethod(){
        // Do stuff
        // Do stuff
        // Do stuff
        // Do stuff
        // Do stuff
        // Do stuff
    }

    public String evaluateType(){
        if (this.type == null) return "No Type";
        return this.type;
    }
    private class  UserAuxiliaryData{
        public String photo;
        public String address;

    }
    protected void doStuffProtected(){

    }
}
