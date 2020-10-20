package lectures.Lecture13;

public class Statics {
    private String s = "Hello World!";

    void setS(String s) {
        this.s = s;
    }

    String getS() {
        return this.s;
    }

    public static void main(String[] args) {
        Statics s1 = new Statics();
        s1.setS("Tjaru");
        Statics s2 = new Statics();
        s2.setS("Hallå");
        System.out.println(s1.getS());
        System.out.println(s2.getS());
    }
}