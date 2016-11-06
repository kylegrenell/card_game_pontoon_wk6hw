package card_game;
import card_game.*;
import java.util.*;

public class Game {
  public Deck deck;
  public Player player;

  public Game(Player player, Deck deck){
    this.player = player;
    this.deck = deck;
}

  public void beginGame(){
    deck.shuffle();
  }

}