package Exercise.develhope.VariablesMethodsConstructor02;

public class Start {
    public static void main(String[] args) {
        Student student1 = new Student("Davide",7);
        Student student2 = new Student("Biagio", 6);
        Teacher teacher1 = new Teacher("Amanda");
        teacher1.assignGrade(student1,9);
        teacher1.assignGrade(student2,8);

        System.out.println(student1.getStudentDetails(student1));
        System.out.println(student2.getStudentDetails(student2));
    }
}
