package data;

public class Material {
    public int getBarDiamater() {
        return barDiamater;
    }

    public void setBarDiamater(int barDiamater) {
        this.barDiamater = barDiamater;
    }

    public int getAgregateDiameter() {
        return agregateDiameter;
    }

    public void setAgregateDiameter(int agregateDiameter) {
        this.agregateDiameter = agregateDiameter;
    }

    int barDiamater;
    int agregateDiameter;
    Concrete concrete;
    boolean stainlessSteel;
    boolean additionalProtection;

}
