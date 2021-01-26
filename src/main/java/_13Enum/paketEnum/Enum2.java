package _13Enum.paketEnum;

public enum Enum2 {
    Asya (1, 1_234_543, "AS"),
    Avrupa(2, 1_234_543, "AV"),
    Amerika(3, 1_234_543, "AME"),
    Afrika(4, 1_234_543, "AF"),
    Avusturalya(5, 1_234_543, "AVU"),
    Antartika(6, 1_234_543, "AN")
    ;

    private int id;
    private long nufus;
    private String kisaltma;

    Enum2(int id, long nufus, String kisaltma) {
        this.id = id;
        this.nufus = nufus;
        this.kisaltma = kisaltma;
    }

    public int getId() {
        return id;
    }

    public long getNufus() {
        return nufus;
    }

    public String getKisaltma() {
        return kisaltma;
    }

    @Override
    public String toString() {
        return "Enum2{" +
                "id=" + id +
                ", nufus=" + nufus +
                ", kisaltma='" + kisaltma + '\'' +
                '}';
    }
}
