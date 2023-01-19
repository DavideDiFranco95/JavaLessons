package Exercise.develhope.VariablesMethodsConstructor02;

public class Student {
    public String name;
    public int grade;
    public Student(String name,int grade){
        this.name=name;
        this.grade=grade;
        System.out.println(this.name + " Has been Created!");
    }
    public String getStudentDetails(){
        return this.name + " " +  this.grade;
    }
}
