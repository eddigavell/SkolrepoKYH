package OvningsTenta;

class PlayingCard {
    private int value;
    private String color;

    private PlayingCard(int x, String y) {
            setValue(x);
            setColor(y);
    }

    private PlayingCard() {
        this(1,"Hearts");
    }

    private void setValue(int x) {
        if (x >= 1 && x <=13) {
            this.value = x;
        } else {
            throw new IllegalArgumentException("Illegal value");
        }
    }

    private void setColor(String y) {
        if(y.equals("Hearts") || y.equals("Spades") || y.equals("Diamonds") || y.equals("Clubs")) {
            this.color = y;
        } else {
            throw new IllegalArgumentException("Illegal color");
        }
    }

    private int getValue() {
        return this.value;
    }

    private String getColor() {
        return this.color;
    }

    public String toString() { //Måste ha public för den bråkar med java.lang.object toString()
        return getValue()+" of "+getColor();
    }

    public static void main(String[] args) {
        PlayingCard kort1 = new PlayingCard();
        System.out.println(kort1.toString());

        PlayingCard kort2 = new PlayingCard(5,"Diamonds");
        System.out.println(kort2.toString());

        PlayingCard kort3 = new PlayingCard(-1, "Diamonds");
        System.out.println(kort3.toString());

        PlayingCard kort4 = new PlayingCard(4, "Fisk");
        System.out.println(kort4.toString());
    }
}