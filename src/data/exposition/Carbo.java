package data.exposition;

public enum Carbo {
    NO_CARBO(0,"Brak ekspozycji na karbonatyzacje"),
    XC_1(1, "XC1 - suche lub stale mokre"),
    XC_2(2, "XC2 - mokre, sporadycznie suche"),
    XC_3(3, "XC3 - umiarkowanie wilgotne"),
    XC_4(4, "XC4 - cyklicznie mokre i suche");

    private int value;
    private String description;

    public int getValue(){
        return value;
    }

    public String getDescription() {
        return description;
    }

    Carbo(int value, String description){
        this.value=value;
        this.description=description;
    }

    static Carbo createFromInt(int carbo){
        return Carbo.values()[carbo];
    }

    @Override
    public String toString() {
        return description;
    }
}
