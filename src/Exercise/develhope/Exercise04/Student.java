package Exercise.develhope.Exercise04;

public class Student {
    public String name;
    public int grade;
    public Student(String name,int grade){
        this.name=name;
        this.grade=grade;
        System.out.println(this.name + " Has been Created!");
    }
    public String getStudentDetails(Student student1){
        return name + " " + grade;
    }
}
