package Exercise.develhope.VariablesMethodsConstructor02;

public class Teacher {
    public String name;
    public Teacher(String name){
        this.name=name;
        System.out.println(this.name + " Has been Created!");
    }
    public int assignGrade(Student student, int finalGrade){
         return student.grade=finalGrade;
    }
}
