package Lecture12;

public class Box {
    private int side;

    public Box(int side) {
        this.side = side;
    }

    int getVolume() {
        //Räknar ut volymen och returnerar den
        return this.side*this.side*this.side;
    }
}