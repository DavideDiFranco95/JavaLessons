package Exercise.develhope.Static;

public class Tester {
    public static void main(String[] args) {
        Employee p1= new Employee("Gennaro",
                "Gennarini","Via dei Gennari");
        Employee p2= new Employee("Marco",
                "Marchesi","Via dei Marchesi");

        Badge badgep1= new Badge(p1);
        Badge badgep2= new Badge(p2);
        badgep1.showBadgeDetails();
        badgep2.showBadgeDetails();
    }
}
