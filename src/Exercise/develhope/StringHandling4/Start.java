package Exercise.develhope.StringHandling4;

public class Start {
    public static void main(String[] args) {
        String veryLongString= "Lorem ipsum dolor sit amet, " +
                "consectetur adipiscing elit, " +
                "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. " +
                "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi " +
                "ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit " +
                "in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur " +
                "sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt " +
                "mollit anim id est laborum.";
        veryLongString.replaceAll("um","HUM");
        System.out.println(veryLongString.indexOf("aliquip"));
        System.out.println(veryLongString.length());

        String sub1= veryLongString.substring(0,199);
        String sub2= veryLongString.substring(199,445);

        System.out.println(sub1);
        System.out.println(sub2);

        System.out.println(sub1.indexOf("est"));
        System.out.println(sub2.indexOf("est"));
        System.out.println(sub1.indexOf("est") ^ sub2.indexOf("est"));
        System.out.println(sub1.contains("est") ^ sub2.contains("est"));


    }
}
