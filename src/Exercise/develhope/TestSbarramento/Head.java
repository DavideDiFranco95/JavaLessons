package Exercise.develhope.TestSbarramento;

public class Head extends Employee{
    private int yearsAsHead;
    public Head(int id, String name,float efficiencyIndex,int yearsAsHead) {
        super(id, name,efficiencyIndex);
        this.yearsAsHead = yearsAsHead;
    }

    @Override
    public boolean canApplyForPromotion() {
        return false;
    }

    @Override
    public boolean mayBeDemoted() {
        return yearsAsHead < 10 && getEfficiencyIndex() < 0.5F;
        

    }
    public void setYearsAsHead(int yearsAsHead) {
        this.yearsAsHead = yearsAsHead;
    }

    @Override
    public float getEfficiencyIndex() {
        return super.getEfficiencyIndex();
    }

    @Override
    public void setEfficiencyIndex(float efficiencyIndex) {
        super.setEfficiencyIndex(efficiencyIndex);
    }


}
