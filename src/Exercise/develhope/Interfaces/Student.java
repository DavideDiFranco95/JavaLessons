package Exercise.develhope.Interfaces;


public class Student extends CollegePerson implements ILearningPerson{
    @Override
    public void studyAtHome() {
        System.out.println("I learn");
    }
    public int academicYear;
    public Student(String name, String surname,int collegeId,int academicYear){
        this.name= name;
        this.surname=surname;
        this.collegeId=collegeId;
        this.academicYear=academicYear;
    }

}
