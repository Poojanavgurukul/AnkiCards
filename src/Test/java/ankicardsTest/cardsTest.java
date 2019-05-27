package ankicardsTest;

import ankicards.Card;
import ankicards.Deck;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class cardsTest {
   @Test public void itShouldGiveDeckName(){
       Deck Maths=new Deck("Maths");
       String expected="Maths";
       assertEquals(expected,Maths.name);
   }
   @Test public void itShouldGiveCardContent(){
       Card content= new Card("what is object","instance of a class");
       String expected = "what is object,instance of a class";
       assertEquals(expected,content.toString());
   }
   @Test public void cardShouldBeAddInDeck(){
       Deck Maths=new Deck("programming");
       List<Card> cards=new ArrayList<>();
       Card card =new Card("what is the notation for n number of choice with replacement","n!");
       Maths.cardInDeck("what is the notation for n number of choice with replacement","n!");
       assertEquals("[what is the notation for n number of choice with replacement,n!]",Maths.cardInDeck().toString());
   }
}
