import card_game.*;
import static org.junit.Assert.*;
import org.junit.*;

public class CardTest {
  private Card card;

  @Before
  public void before(){
    // creating new instances of card and hand for testing
    this.card = new Card(Suit.CLUBS, Rank.NINE, 2);
  }

  // run test to check if the card has a Suit
  @Test
  public void cardHasSuit(){
    assertEquals(Suit.CLUBS, this.card.getSuit());
    // Suit.Clubs expected, referencing this.card instance from method getSuit in in Card class
  }

  // run test to check if the card has a rank (number/face cards)
  @Test
  public void cardHasRank(){
    assertEquals(Rank.NINE, this.card.getRank());
  }

  // run a test to see if cards can be added to the hand
 
}