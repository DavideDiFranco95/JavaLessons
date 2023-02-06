package Exercise.develhope.TestSbarramento;

public class Workman extends Employee{
    private int weeklyWorkingHours;

    public Workman(int id, String name,float efficiencyIndex,int weeklyWorkingHours) {
        super(id, name,efficiencyIndex);
        this.weeklyWorkingHours=weeklyWorkingHours;
    }



    @Override
    public boolean canApplyForPromotion() {
        return weeklyWorkingHours > 35 && getEfficiencyIndex() > 0.65F;
    }

    @Override
    public boolean mayBeDemoted() {
        return false;
    }


    public void setWeeklyWorkingHours(int weeklyWorkingHours) {
        this.weeklyWorkingHours = weeklyWorkingHours;
    }
    @Override
    public void setEfficiencyIndex(float efficiencyIndex) {
        super.setEfficiencyIndex(efficiencyIndex);
    }

    @Override
    public float getEfficiencyIndex() {
        return super.getEfficiencyIndex();
    }
}
