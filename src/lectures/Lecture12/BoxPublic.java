package Lecture12;

public class BoxPublic extends Box {

    public BoxPublic(int side) {
        super(side);
    }

    @Override
    public int getVolume() {
        return super.getVolume();
    }
}