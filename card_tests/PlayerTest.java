import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;

public class PlayerTest {

   Player player1;
   Player player2;

   @Before
   public void before(){
     player1 = new Player("Kyle");
     player2 = new Player("Game Dealer");
}

@Test
public void playerHasName(){
 assertEquals("Kyle", player1.getName());
}

@Test
public void dealerHasName(){
 assertEquals("Game Dealer", player2.getName());
}

}