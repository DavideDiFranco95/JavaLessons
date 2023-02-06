package Exercise.develhope.TestSbarramento;

public abstract class Employee {
    private int id;
    private String name;
    private float efficiencyIndex;

    public Employee(int id, String name,float efficiencyIndex){
        this.id=id;
        this.name=name;
        this.efficiencyIndex=efficiencyIndex;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", efficiencyIndex=" + efficiencyIndex +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getEfficiencyIndex() {
        return efficiencyIndex;
    }
    public void setEfficiencyIndex(float efficiencyIndex) {
        this.efficiencyIndex = efficiencyIndex;
    }
    public abstract boolean canApplyForPromotion();
    public abstract boolean mayBeDemoted();


}
