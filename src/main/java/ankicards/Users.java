package ankicards;

import java.util.Scanner;

public class Users {
    public static void main(String[] args) {
        Deck deck =new Deck("Java");
        deck.addCard("what is class","blue print");
        deck.addCard("what is object","instance of a class");
        for (Card cards:deck.getCards()) {
            Scanner input = new Scanner(System.in);
            System.out.println(cards.front);
            System.out.println("Show Answer");
            String  showAnswer = input.nextLine();
            System.out.println( "Answer:- " +cards.back);return;
        }
    }
}
