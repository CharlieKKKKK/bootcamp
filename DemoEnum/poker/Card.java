package DemoEnum.poker;

public class Card {
  
 private Suit suit;
 private Rank rank;

 public Card(Rank rank, Suit suit) {
  this.rank = rank;
  this.suit = suit;
}
public String toString(){
  return this.suit + " "+ this.rank ;

}
}
