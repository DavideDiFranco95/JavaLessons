package Exercise.develhope.VariablesMethodsConstructor02;

public class Student {
    public String name;
    public int grade;
    public Student(String name,int grade){
        this.name=name;
        this.grade=grade;
        System.out.println(this.name + " Has been Created!");
    }
    public void getStudentDetails(){
        System.out.println(this.name + " " +  this.grade);
    }
}
