package Exercise.develhope.Interfaces;

public class CollegePerson {
    public String name;
    public String surname;
    public int collegeId;

    public String goToCollege(CollegePerson person){
        return "Name: " + person.name + " Surname: " + person.surname + " ID: " + person.collegeId;
    }

}
