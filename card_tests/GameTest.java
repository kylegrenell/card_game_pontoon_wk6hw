import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;

public class GameTest {
     Game game;
     Player player;
     Player gameDealer;
     Hand player.hand;
     Hand gameDealer.hand;
     Deck deck;
     Card card1;
     Card card2;

     @Before
     public void before(){
          game = new Game();
          deck = new Deck();
          player = new Player();
          gameDealer = new Player();
          player.hand = new Hand();
          gameDealer.hand = new Hand();
          card1 = new Card(Suit.DIAMONDS, Rank.TEN);
          card2 = new Card(Suit.HEARTS, Rank.QUEEN);
          deck.addCard(card1);
          deck.addCard(card2);
     }

     @Test
     public void canDealHand() {
          game.dealHand(deck, player);
          assertEquals(2, player.hand.handSize());
     }


}