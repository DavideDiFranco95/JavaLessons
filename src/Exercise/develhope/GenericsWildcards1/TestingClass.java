package Exercise.develhope.GenericsWildcards1;

import java.util.ArrayList;
import java.util.List;

public class TestingClass {
    public static void main(String[] args) {
        List<Double> individualMarksListLisa = new ArrayList<>();
        individualMarksListLisa.add(0,27.2);
        individualMarksListLisa.add(1,24.6);
        List<Integer> projectMarksListJeremy = new ArrayList<>();
        projectMarksListJeremy.add(0,8);
        projectMarksListJeremy.add(1,7);

        double lisaAvg = Student.getAverageMark(individualMarksListLisa);
        double jeremyAvg = Student.getAverageMark(projectMarksListJeremy);

        Student lisa = new Student("Lisa","Lucardi",lisaAvg);
        Student jeremy = new Student("Jeremy","Johansen",jeremyAvg);
        List<Student> listOfStudents = new ArrayList<>();
        listOfStudents.add(lisa);
        listOfStudents.add(jeremy);
        System.out.println(listOfStudents);


    }
}
