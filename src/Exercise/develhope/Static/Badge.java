package Exercise.develhope.Static;

import java.util.Random;

public class Badge {
    private static int totalNumberOfEmployees;
    private String badgeIdCode;
    public Employee employee;
    private static void keepTrackOfEmployeesNumber(){
        //aumentare di 1 il totalNumberOfEmployees
        totalNumberOfEmployees=totalNumberOfEmployees+1;
    }
    private String generateBadgeIdCode(){

        String str1 = "";
        String str2 = "";

        for (int i=0; i<=2;i++){
            Random rn = new Random();
            char randomChar = (char)(rn.nextInt(90-65) + 'a');
            str1+= randomChar;

        }
        for (int i=0; i<=2;i++) {
            Random rn = new Random();
            char randomChar = (char) (rn.nextInt(90-65) + 'a');
            str2 += randomChar;
        }
        str1=str1.toUpperCase();
        str2=str2.toUpperCase();
        return str1 + this.employee.name + " " + this.employee.surname + str2;
    }
    public void showBadgeDetails(){
        String a="Total number of Employees "+totalNumberOfEmployees+".\n"+
                "details of "+employee.getEmployeeDetails()+".\n"+
                "badge ID Code " + badgeIdCode;
        System.out.println(a);
    }

    public Badge (Employee employeeThatNeedBadge) {
        keepTrackOfEmployeesNumber();
        employee=employeeThatNeedBadge;
        badgeIdCode=generateBadgeIdCode();
    }
}
