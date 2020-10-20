package OvningsTenta;

class PlayingCard {
    private int value;
    private String color;

    PlayingCard(int x, String y) {
        try {
            setValue(x);
            setColor(y);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }

    PlayingCard() {
        this(1,"Hearts");
    }

    void setValue(int x) {
        if (x >= 1 && x <=13) {
            this.value = x;
        } else {
            throw new IllegalArgumentException("Illegal value");
        }
    }

    void setColor(String y) {
        if(y.equals("Hearts") || y.equals("Spades") || y.equals("Diamonds") || y.equals("Clubs")) {
            this.color = y;
        } else {
            throw new IllegalArgumentException("Illegal color");
        }
    }

    int getValue() {
        return this.value;
    }

    String getColor() {
        return this.color;
    }

    public String toString() {
        return getValue()+" of "+getColor();
    }

    public static void main(String[] args) {
        PlayingCard kort1 = new PlayingCard();
        //System.out.println(kort1);


        PlayingCard kort2 = new PlayingCard(5,"Diamonds");
        //System.out.println(kort2);

        PlayingCard kort3 = new PlayingCard(-1, "Diamonds");
        //System.out.println(kort3);

        PlayingCard kort4 = new PlayingCard(4, "Fisk");
        //System.out.println(kort4);

        System.out.println(kort1.toString());

    }
}