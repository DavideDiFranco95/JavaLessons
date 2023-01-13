package Exercise.develhope.Interfaces;

public class Assistant extends CollegePerson implements ITeachingPerson, ILearningPerson{
    @Override
    public void studyAtHome() {
        System.out.println("I'm teaching while learning");
    }

    @Override
    public void teachToOtherPeople() {
        System.out.println("I'm learning while teaching");
    }
    public boolean isGoingToBeAPhD;
    public Assistant(String name,String surname,int collegeId,boolean isGoingToBeAPhD){
        this.name=name;
        this.surname=surname;
        this.collegeId=collegeId;
        this.isGoingToBeAPhD=isGoingToBeAPhD;
    }
}
