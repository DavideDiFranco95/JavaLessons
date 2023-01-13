package it.develhope.Utility;

import it.develhope.Accessibility.entities.User;

public class UserUtility {
    public static String getCompleteName(User user){
        return user.name + " " + user.surname;
    }
    public String getType(User user){
        return user.evaluateType;
    }
}
