package it.develhope.Accessibility.businessLogic;

import it.develhope.Accessibility.entities.User;
import it.develhope.Utility.UserUtility;

public class Start {
    public static void main(String[] args) {
        User user= new User();
        user.name= "asdasd";
        user.surname="asdasd";


        user.doStuff();

        String completeName=UserUtility.getCompleteName(user);
        String type=new UserUtility().getType(user);
        ///------------------------------------------------------

    }
}
