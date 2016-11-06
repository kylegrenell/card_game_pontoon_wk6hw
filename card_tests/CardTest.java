import card_game.*;
import static org.junit.Assert.*;
import org.junit.*;

public class CardTest {
  private Card card;
  private Hand hand;

  @Before
  public void before(){
    // creating new instances of card and hand for testing
    this.card = new Card(Suit.CLUBS, Rank.NINE);
    this.hand = new Hand();
  }

  @Test
  public void cardHasSuit(){
    assertEquals(Suit.CLUBS, this.card.getSuit());
    // Suit.Clubs is the instance, referencing this.card from method getSuit
  }

  @Test
  public void cardHasRank(){
    assertEquals(Rank.NINE, this.rank.getRank());
  }



}