public class InsuranceStrategyLow extends InsuranceStrategy {
    @Override
    public int getConstant() {
        return 1;
    }

    @Override
    public double getWeight() {
        return 0.365;
    }

    @Override
    public int getAdjustment() {
        return 0;
    }
}
