package data.exposition;

public enum Chlorine {
    NO_CHLOR(0,"Brak ekspozycji na chlor"),
    XD_1(1, "XD1 - umiarkowanie wilgotne"),
    XD_2(2, "XD2 - mokre, sporadycznie suche"),
    XD_3(3, "XD3 - cyklicznie mokre i suche");

    private int value;
    private String description;

    public int getValue(){
        return value;
    }

    public String getDescription() {
        return description;
    }

    Chlorine(int value, String description){
        this.value=value;
        this.description=description;
    }

    static Chlorine createFromInt(int carbo){
        return Chlorine.values()[carbo];
    }

    @Override
    public String toString() {
        return description;
    }
}
