package Exercise.develhope.Enumerations;

public class Start {
    public static void main(String[] args) {
        enum Month {
            JANUARY,
            FEBRUARY,
            MARCH,
            APRIL,
            MAY,
            JUNE,
            JULY,
            AUGUST,
            SEPTEMBER,
            OCTOBER,
            NOVEMBER,
            DECEMBER
        };

        for(Month month : Month.values()){
            if (month.name().endsWith("Y")){
                System.out.println(month.name() + " ends with Y");
            }else{
                System.out.println(month.name() + " doesn't end with Y");
            }
        }
    }
}
