package data.exposition;


public enum Freezing {
    NO_FREEZING(0, "Brak ekspozycji na zamrazanie/odmrazanie"),
    XF_1(1, "XF1 - umiarkowanie nasysenie woda - bez odladzania"),
    XF_2(2, "XF2 - umiarkowanie nasysenie woda - z odladzaniem"),
    XF_3(3, "XF3 - silne nasysenie woda - bez odladzania"),
    XF_4(4, "XF4 - silne nasysenie woda - z odladzaniem");
    private int value;
    private String description;

    public int getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    Freezing(int value, String description) {
        this.value = value;
        this.description = description;
    }

    static Freezing createFromInt(int carbo) {
        return Freezing.values()[carbo];
    }

    @Override
    public String toString() {
        return description;
    }
    }
