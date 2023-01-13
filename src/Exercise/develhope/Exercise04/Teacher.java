package Exercise.develhope.Exercise04;

public class Teacher {
    public String name;
    public Teacher(String name){
        this.name=name;
        System.out.println(this.name + " Has been Created!");
    }
    public void assignGrade(Student student,int finalGrade){
         student.grade=finalGrade;
    }
}
