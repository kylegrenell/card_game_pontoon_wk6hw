import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;

public class HandTest {
     Hand hand;
     Card card;

     @Before
     public void before(){
          hand = new Hand();
          card = new Card(Suit.HEARTS, Rank.TWO);
     }

     @Test
     public void canCountHandSize(){
          assertEquals(0, hand.handSize());
     }

     @Test
     public void canAddCard() {
          hand.addCard(card);
          assertEquals(1, hand.handSize());
     }

 

 }