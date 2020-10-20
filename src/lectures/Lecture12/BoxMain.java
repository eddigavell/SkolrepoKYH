package Lecture12;

public class BoxMain {
    public static void main(String[] args) {
        Box b = new Box(2);
        System.out.println(b.getVolume());


        BoxPublic bp = new BoxPublic(4);
        System.out.println(bp.getVolume());
    }
}
