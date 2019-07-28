package ankicardsTest;

import ankicards.Card;
import ankicards.Deck;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AnkiCardTest {
   @Test public void itShouldGiveDeckName(){
       Deck Maths=new Deck("Maths");
       String expected="Maths";
       assertEquals(expected,Maths.name);
   }
   @Test public void cardShouldBeAddInDeck(){
       Deck programming=new Deck("programming");
       List<Card> expextedCards=new ArrayList<>();
       Card card =new Card("what is the notation for n number of choice with replacement","n!");
       programming.addCard("what is the notation for n number of choice with replacement","n!");
       expextedCards.add(card);
       assertEquals(expextedCards,programming.getCards());
   }
}