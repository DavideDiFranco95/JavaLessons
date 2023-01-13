package Exercise.develhope.Exercise05;

public class JavaTestingClass {
    public static void main(String[] args) {
        Professor professor = new Professor("Aldo","Alighieri",1,"Di Franco Davide");

        Student student = new Student("Davide", "Di Franco", 14,1);

        Assistant assistant = new Assistant("Giovanni","Grieco", 73, true);

        System.out.println(professor.goToCollege(professor));
        professor.teachToOtherPeople();

        System.out.println(student.goToCollege(student));
        student.studyAtHome();

        System.out.println(assistant.goToCollege(assistant));
        assistant.teachToOtherPeople();
        assistant.studyAtHome();
    }
}
