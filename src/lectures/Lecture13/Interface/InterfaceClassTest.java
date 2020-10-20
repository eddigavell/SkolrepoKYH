package lectures.Lecture13.Interface;

public class InterfaceClassTest implements Desert {
    private int menuNumber;
    private int calories;
    InterfaceClassTest(int calories, int menuNumber) {
        this.menuNumber = calories;
        this.calories = menuNumber;
    }

    public int getNumberOnDesertMenu() {
        return menuNumber;
    }

    public int getNumberOfCalories() {
        return calories;
    }
}
