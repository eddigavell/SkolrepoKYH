package OvningsTenta;

class PlayingCard {
    private int value;
    private String color;

    public PlayingCard(int x, String y) {
        try {
            setValue(x);
            setColor(y);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }

    public PlayingCard() {
        PlayingCard ace = new PlayingCard(1,"Hearts");
    }

    public void setValue(int x) {
        if (x >= 1 && x <=13) {
            this.value = x;
        } else {
            throw new IllegalArgumentException("Illegal value");
        }
    }

    public void setColor(String y) {
        if(y.equals("Hearts") || y.equals("Spades") || y.equals("Diamonds") || y.equals("Clubs")) {
            this.color = y;
        } else {
            throw new IllegalArgumentException("Illegal color");
        }
    }

    public int getValue() {
        return this.value;
    }

    public String getColor() {
        return this.color;
    }

    public String toString() {
        return getValue()+" of "+getColor();
    }

/* Den ska också ha en konstruktor som inte tar in något argument, den
ska skapa upp en instans för kortet hjärter äss (“Hearts”, 1).
*/
}