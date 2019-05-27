package ankicardsTest;

import ankicards.Deck;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class cardsTest {
   @Test public void itShouldGiveDeckName(){
       Deck name=new Deck("Maths");
       String expected="Maths";
       assertEquals(expected,name.name);
   }
}
