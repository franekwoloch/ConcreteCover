package data.exposition;

//Carbonatization class
public enum Sea {
    NO_SEA(0, "Brak ekspozycji na wode morska"),
    XS_1(1, "XS1 - ekspozycja na agresywne powietrze"),
    XS_2(2, "XS2 - stale zanurzenie"),
    XS_3(3, "XS3 - strefy rozbryzgow");
    private int value;
    private String description;

    public int getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    Sea(int value, String description) {
        this.value = value;
        this.description = description;
    }

    static Sea createFromInt(int carbo) {
        return Sea.values()[carbo];
    }

    @Override
    public String toString() {
        return description;
    }
    }
