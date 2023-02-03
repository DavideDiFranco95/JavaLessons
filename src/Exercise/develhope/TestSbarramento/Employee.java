package Exercise.develhope.TestSbarramento;

public abstract class Employee {
    private int id;
    private String name;
    private float efficiencyIndex;

    public Employee(int id, String name){
        this.id=id;
        this.name=name;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setEfficiencyIndex(float efficiencyIndex) {
        this.efficiencyIndex = efficiencyIndex;
    }
    public abstract boolean canApplyForPromotion();
    public abstract boolean mayBeDemoted();
}
