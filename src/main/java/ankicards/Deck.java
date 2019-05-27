package ankicards;

public class Deck {
   public String name;

    public static void main(String[] args) {
        System.out.println(new Deck("Maths").name);
    }
    public Deck(String name) {
        this.name = name;
    }
}
