package it.develhope.Accessibility.businessLogic;

import it.develhope.Accessibility.entities.User;

public class SuperUserFromDifferentPackage extends User {
    public void doOtherStuff(){
        this.type= "ADMIN";
    }
    @Override //Con l'Override puoi promuovere a public un protected ma non private
    public void doStuffProtected(){
        super.doStuffProtected();
    }

    //private - protected - public
}
