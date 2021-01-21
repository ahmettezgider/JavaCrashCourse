package _13Enum;

public enum ClassEnum1 {
    aa(1, "a"),
    bb(2, "b"),
    cc(3, "b"),
    dd(4, "d")
    ;

    private int i;
    private String s;

    ClassEnum1(int i, String s){
        this.i = i;
        this.s = s;
    }

    public int getI() {
        return i;
    }

    public String getS() {
        return s;
    }
}
