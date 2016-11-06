package card_game;
import card_game.*;
import java.util.*;

public class Deck{

  private ArrayList<Card> deck;
  private Card card;

  public Deck(){
    this.deck = new ArrayList<Card>();  
    this.card = card;
  }

  // return the cards from the deck
  public ArrayList<Card> getCards(){
    return this.deck;
  }

  // add a card to the deck
  public void addCard(Card card){
    this.deck.add(card);
  }

  // be able to deal a card from the deck
  public void dealCard() {
    Card card = deck.remove(0);
  }

  // be able to get size of the deck 
  public int getDeckSize(){
    return deck.size();
  }

  // be able to shuffle the deck
  public void shuffle(){
    Collections.shuffle(deck);
  }

  // be able to build a deck of cards from suit and rank
  public void buildDeck(){
    for( Suit suit : Suit.values()) {
      for ( Rank rank : Rank.values()){
        deck.add(new Card(suit, rank));
      }
    }
  }

}