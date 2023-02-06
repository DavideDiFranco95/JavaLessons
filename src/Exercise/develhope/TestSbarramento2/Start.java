package Exercise.develhope.TestSbarramento2;

import java.util.ArrayList;
import java.util.List;

public class Start {
    public static void main(String[] args) {
        Skill skill1 = new Skill("Fireball",25,20);
        Skill skill2 = new Skill("Icy Lance",12,10);
        Skill skill3 = new Skill("Overpower",20,5);
        Skill skill4 = new Skill("Heroic Throw",12,2);
        List<Skill> warSkills = new ArrayList<>();
        List<Skill> mageSkills = new ArrayList<>();

        Warrior warrior = new Warrior("Darnav Gravis",15,100,15,warSkills);
        Wizard wizard = new Wizard("Istra WhisperSong",15,70,100,mageSkills);
        warrior.addSkill(skill3);
        warrior.addSkill(skill4);
        wizard.addSkill(skill1);
        wizard.addSkill(skill2);
        warrior.attack(wizard,warrior.getSkill(0));
        warrior.attack(wizard,warrior.getSkill(1));
        wizard.attack(warrior,wizard.getSkill(0));
        wizard.attack(warrior,wizard.getSkill(1));

        System.out.println(warrior.isAlive());
        System.out.println(wizard.isAlive());

    }
}
