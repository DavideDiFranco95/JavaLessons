package Exercise.develhope.TestSbarramento2;

import java.util.List;

public class Warrior extends Character{

    private int strength;
    public Warrior(String name,int strength, int lifePoints, int manaPoints, List<Skill> skills) {
        super(name, lifePoints, manaPoints, skills);
        this.setStrength(strength);
    }



    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public void attack(Character character, Skill s) {
        if (getManaPoints()>s.getMana()){
            setManaPoints(getManaPoints()-s.getMana());
            int warDmg;
            warDmg = s.getDamage() + getStrength();
            character.setLifePoints(character.getLifePoints()-warDmg);
        }
    }
}
