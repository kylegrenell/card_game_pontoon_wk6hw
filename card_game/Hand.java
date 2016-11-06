package card_game;
import java.util.*;

public class Hand {
  // need an array list
  private ArrayList<Card> hand;
  private Card card;
  private Deck deck;
// constructor that's invoked to create objects

  public Hand(){
    this.hand = new ArrayList<Card>();
    this.deck = deck;
  }     // create a new object of array list

  // add card to hand
  public void addCard(Card card){
    this.hand.add(card);
  }

  // get card
  public Card getCard(int cardIndex){
    return hand.get(cardIndex);
  }

  // get the size of hand
  public int handSize(){
    return hand.size();
  }


}