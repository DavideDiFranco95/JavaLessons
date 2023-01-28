package Exercise.develhope.Static;

public class Badge {
    private static int totalNumberOfEmployees;
    private String badgeIdCode;
    public Employee employee;
    private static void keepTrackOfEmployeesNumber(){
        //aumentare di 1 il totalNumberOfEmployees

    }
    private String generateBadgeIdCode(){
        return "ABC" + employee.name + " " + employee.surname + "DEF";
    }
    public void showBadgeDetails(){
        //System.out.println(keepTrackOfEmployeesNumber);
        System.out.println(employee.getEmployeeDetails());
        System.out.println(badgeIdCode);
    }

    public Badge (String employeeThatNeedBadge) {
        keepTrackOfEmployeesNumber();
        employeeThatNeedBadge=employee.getEmployeeDetails();
    }
}
