package Exercise.develhope.ClassesAndObjects02;

public class Team {

    public String teamName;

        public Programmer p1;
        public Programmer p2;

    public Team(String teamName, Programmer p1, Programmer p2) {
        this.teamName = teamName;
        this.p1 = p1;
        this.p2 = p2;
    }

    public void printTeamDetails(Team team){
            System.out.println(team.teamName);
            System.out.println(team.p1.printProgrammerDetails(p1));
            System.out.println(team.p2.printProgrammerDetails(p2));
        }



    }

