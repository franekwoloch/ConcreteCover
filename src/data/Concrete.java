package data;

public enum Concrete {
    C8_10(8),
    C12_15(12),
    C16_20(16),
    C20_25(20),
    C25_30(25),
    C30_37(30),
    C35_45(35),
    C40_50(40),
    C45_55(45),
    C50_60(50);


    private int strength;

    public int getStrength() {
        return strength;
    }

    Concrete(int strength) {
        this.strength = strength;
    }


    @Override
    public String toString() {
        return "Beton klasy C-"+strength;
    }
}

