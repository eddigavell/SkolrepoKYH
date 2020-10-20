package jessicalabb5;

public class Die {
    int value = 0;

    void DieRoll() {
        value = (int)(Math.random()*6+1);
    }

    String getString() {
        return "Dice shows " + value;
    }
}
