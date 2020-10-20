package Lecture11;

class Box<T> {
    private T content;

    Box(T i) {
        this.content = i;
    }

    T getContent() {
        return this.content;
    }

    void setContent(T i) {
        this.content = i;
    }

    public static void main(String[] args) {
        Box<Integer> box = new Box<>(5);
        Box<Double> box2 = new Box<>(1.5);
        box2.setContent(100.22);
        System.out.println(box.getContent());
        box.setContent(7);
        System.out.println(box.getContent());
    }
}
