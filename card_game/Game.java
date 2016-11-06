package card_game;
import card_game.*;
import java.util.*;

public class Game {
  public Deck deck;
  public Player player;
  public Player gameDealer;

  public Game(Player player, Deck deck){
    this.player = player;
    this.deck = deck;
    this.gameDealer = gameDealer;
}

  public void beginGame(){
    deck.shuffle();
  }

  public void dealHand(Deck deck, Player player){  
    Card card1 = deck.getCard(); 
    Card card2 = deck.addCard(); 
    Hand hand = player.getHand(); 
    hand.addCard(card1); 
    hand.addCard(card2);
  }

}