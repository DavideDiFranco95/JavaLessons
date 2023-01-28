package Exercise.develhope.Static;

public class Employee {
    public String name;
    public String surname;
    public String address;


    public Employee(String name, String surname, String address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    public String getEmployeeDetails(){
        return name;
    }
}
