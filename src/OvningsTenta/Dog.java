package OvningsTenta;

public class Dog {
    public static void main(String[] args) {
        //PlayingCard HeartsOfAce = new PlayingCard();
        new PlayingCard();
        PlayingCard kiss = new PlayingCard(14, "Hearts");
        PlayingCard kiss2 = new PlayingCard(2, "Fisk");
        System.out.println(kiss.toString());
        System.out.println(kiss2.toString());
    }
}