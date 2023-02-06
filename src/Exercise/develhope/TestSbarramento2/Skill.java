package Exercise.develhope.TestSbarramento2;

public class Skill {
    public String name;
    private int damage;
    private int mana;

    public Skill(String name, int damage, int mana) {
        this.name = name;
        this.setDamage(damage);
        this.setMana(mana);
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        if (this.damage>=0){
            this.damage = damage;
        }
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        if (this.mana>=0){
            this.mana = mana;
        }
    }

    @Override
    public String toString() {
        return "Skill{" +
                "name='" + name + '\'' +
                ", damage=" + damage +
                ", mana=" + mana +
                '}';
    }
}
