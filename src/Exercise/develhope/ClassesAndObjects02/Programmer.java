package Exercise.develhope.ClassesAndObjects02;

public class Programmer {
    public String name;
    public String programmingLanguage;
    public int yearsOfExperience;

    public Programmer(String name,String programmingLanguage, int yearsOfExperience) {
        this.name=name;
        this.programmingLanguage=programmingLanguage;
        this.yearsOfExperience=yearsOfExperience;
    }

    public void printProgrammerDetails(){
        System.out.println(this.name + " " + this.programmingLanguage + " " + this.yearsOfExperience);
    }



}

