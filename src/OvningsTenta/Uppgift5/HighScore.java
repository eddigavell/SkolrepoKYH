package OvningsTenta.Uppgift5;

public class HighScore {
    //Ändrat alla loopar till list.length
    Competitor[] list = new Competitor[10];
    public HighScore() {
        for(int i=0;i<= list.length-1;i++) {
            list[i] = new Competitor("Not occupied", 0);
        }
    }

    public void addCompetitorToList(Competitor c) { // tog bort Competitor upNextCmp då det var onödigt.
        for(int i=0;i< list.length;i++) { //Ändra till i, för enhetligt.
            if(c.score>list[i].score) { //Ändra från < -> > för att det inte la till.
                Competitor tmp = list[i];
                list[i] = c;
                c = tmp;
            }
        }
    }

    public void printList() {
        for(int i=0;i< list.length;i++) {
            System.out.println((i+1) + ". " + list[i].name + " with " +
                    list[i].score + " points");
        }
    }

    public static void main(String[] args) {
       HighScore hs = new HighScore();
        hs.printList();
        hs.addCompetitorToList(new Competitor("Anna", 10));
        hs.addCompetitorToList(new Competitor("Bertil", 100));
        hs.addCompetitorToList(new Competitor("Cecilia", 50));
        hs.addCompetitorToList(new Competitor("Dennis", 1000));
        hs.printList();
    }
}
