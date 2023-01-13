package Exercise.develhope.ClassesAndObjects02;

public class CompetitionRules {

    private static CompetitionRules instance=null;
    private CompetitionRules(){
    }
    private String competitionRules1="Do not copy and paste from StackOverflow!";
    private String competitionRules2="Learn every day!";
    private String competitionRules3="Be the best team!";


    public String getCompetitionRules1() {
        return competitionRules1;
    }

    public String getCompetitionRules2() {
        return competitionRules2;
    }

    public String getCompetitionRules3() {
        return competitionRules3;
    }

    public static CompetitionRules getPrintRules(){
        if(instance==null){
            instance = new CompetitionRules();
        }
        return instance;
    }


}
