package Exercise.develhope.TestSbarramento2;

import java.util.List;

public class Wizard extends Character{
    private int abilityPower;
    public Wizard(String name,int abilityPower, int lifePoints, int manaPoints, List<Skill> skills) {
        super(name, lifePoints, manaPoints, skills);
        this.setAbilityPower(abilityPower);
    }



    public int getAbilityPower() {
        return abilityPower;
    }

    public void setAbilityPower(int abilityPower) {
        this.abilityPower = abilityPower;
    }


    @Override
    public void attack(Character character, Skill s) {
        if (getManaPoints()>s.getMana()){
            setManaPoints(getManaPoints()-s.getMana());
            int wizDmg;
            wizDmg = s.getDamage() + getAbilityPower();
            character.setLifePoints(character.getLifePoints()-wizDmg);
        }
    }
}
