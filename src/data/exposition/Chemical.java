package data.exposition;


public enum Chemical {
    NO_CHEMICAL(0, "Brak ekspozycji na agresje chemiczna"),
    XA_1(1, "XA1 - srodowisko malo agresywne"),
    XA_2(2, "XA2 - srodowisko srednio agresywne"),
    XA_3(3, "XA3 - srodowisko silnie agresywne");

    private int value;
    private String description;

    public int getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    Chemical(int value, String description) {
        this.value = value;
        this.description = description;
    }

    static Chemical createFromInt(int carbo) {
        return Chemical.values()[carbo];
    }

    @Override
    public String toString() {
        return description;
    }
    }
