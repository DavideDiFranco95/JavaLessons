package it.develhope.Enumerations;

public class Start {
    public static void main(String[] args) {
        User lorenzo = new User(UserTypeEnum.MEGA_ADMIN,"Lorenzo","De Francesco","lory1990");
        User giulio = new User(UserTypeEnum.SUPER_ADMIN,"Giulio","Verdi","giu875");
        User davide = new User(UserTypeEnum.ADMIN,"Davide","Di Franco","zarga095");
        User mario = new User(UserTypeEnum.EDITOR,"Mario","Rossi","mario2020");
        User elena = new User(UserTypeEnum.REGISTERED,"Elena","Bianchi","ele859");
        User olgyen = new User(UserTypeEnum.GUEST,"Olgyen","Murthis","olgy666");

        System.out.println("---------------------------------");
        printUserType(lorenzo);
        printUserType(giulio);
        printUserType(davide);
        printUserType(mario);
        printUserType(elena);
        printUserType(olgyen);
        System.out.println("---------------------------------");

        System.out.println("Lorenzo " + lorenzo.getType().isAdmin());
        System.out.println("Giulio " + giulio.getType().isAdmin());
        System.out.println("Davide " + davide.getType().isAdmin());
        System.out.println("Mario " + mario.getType().isAdmin());
        System.out.println("Elena " + elena.getType().isAdmin());
        System.out.println("Olgyen " + olgyen.getType().isAdmin());

        System.out.println("Are Lorenzo and Giulio equals type? " + (lorenzo));

        System.out.println("---------------------------------");
        UserTypeEnum[] values = UserTypeEnum.values();
    }

    public static void printUserType(User user){
        System.out.println("UserName " + user.getCompleteName());
        System.out.println("User permission are " + user.getType());
        switch (user.getType()){
            case MEGA_ADMIN:
                System.out.println("the user is mega admin");
                break;
            case SUPER_ADMIN:
                System.out.println("the user is super admin");
                break;
            case ADMIN:
                System.out.println("the user is admin");
                break;
            case EDITOR:
                System.out.println("the user is editor");
                break;
            case REGISTERED:
                System.out.println("the user is logged");
                break;
            case GUEST:
                System.out.println("the user is guest");
                break;
            default:
                System.out.println("the user is not Defined");
                break;
        }
    }
}
