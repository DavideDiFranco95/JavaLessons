package Exercise.develhope.Exercise02;

public class Competition {
    public static void main(String[] args) {
        System.out.println("---------ES:2-----------");
        Programmer p1,p2,p3,p4;
        p1= new Programmer("Davide","Java", 0);
        p2= new Programmer("Fabrizio","Python",15);
        p3= new Programmer("Giorgio","C++", 2);
        p4= new Programmer("Aldo","JavaScript", 7);

        Team team1,team2;
        team1= new Team("TeamBlu",p1,p2);
        team2= new Team("TeamRosso",p3,p4);


        CompetitionRules rules= CompetitionRules.getPrintRules();
        System.out.println(rules.getCompetitionRules1() + "\n" + rules.getCompetitionRules2() + "\n" + rules.getCompetitionRules3());
        team1.printTeamDetails(team1);
        team2.printTeamDetails(team2);


    }
}
