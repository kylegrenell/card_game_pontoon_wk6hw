package card_game;
import card_game.*;
import java.util.*;

public class Player{

  String name;
  Hand hand;

  public Player(String name){
    this.name = name;
  }

// be able to get player name 
  public String getName(){
    return this.name;
  }
  
// be able to get hand 
  public Hand getHand(){
    return this.hand;
  }

}