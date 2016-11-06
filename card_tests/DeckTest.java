import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import card_game.*;

public class DeckTest {

  Deck deck;

// new instance of deck for testing
  @Before
  public void before() {
    deck = new Deck(); 
  }

// test if can build a deck of 52 cards
  @Test
  public void canBuildDeck(){
    deck.buildDeck();
    assertEquals(deck.getCards().size(),52);
  }

}