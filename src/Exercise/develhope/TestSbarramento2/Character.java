package Exercise.develhope.TestSbarramento2;

import java.util.ArrayList;
import java.util.List;

public abstract class Character {


    private String name;
    private int lifePoints;
    private int manaPoints;
    private List<Skill> skills;

    public Character(String name, int lifePoints, int manaPoints, List<Skill> skills) {
        this.name = name;
        this.lifePoints = lifePoints;
        this.manaPoints = manaPoints;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public int getManaPoints() {
        return manaPoints;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    public void setManaPoints(int manaPoints) {
        this.manaPoints = manaPoints;
    }

    public void addSkill(Skill s){
        skills.add(s);
    }
    public Skill getSkill(int i){
        return skills.get(i);
    }
    public boolean isAlive(){
        if (lifePoints>0){
            return true;
        }else return false;
    }
    public abstract void attack(Character character,Skill s);

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", lifePoints=" + lifePoints +
                ", manaPoints=" + manaPoints +
                ", skills=" + skills +
                '}';
    }
}
