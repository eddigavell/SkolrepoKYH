package lectures.Lecture7;

class Rectangle implements Shape {
    private int width;
    private int height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return this.width * this.height;
    }

    public int getCircumference() {
        return ((this.width*2) + (this.height*2));
    }
}
