package DemoEnum.poker;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class Deck {

  private Card[] cards;

  private Deck(int numberOfCards) {
    this.cards = new Card[numberOfCards];
    int idx = 0;
    for (Suit s : Suit.values()) {
      for (Rank r : Rank.values()) {
        this.cards[idx++] = new Card(r, s);
      }
    }
  }

  public static Deck pocker() {
    return new Deck(52);
  }
  public Card[] getCard(){//
    return this.cards;
  }

  public void overhand() {

    Random random1 = new Random();
    int randomNumber = random1.nextInt(52);
    // int randomNumber = (int)(Math.random()*52)+1; 有咩差別

    Card[] cards = this.cards.clone();
    Card[] temp = new Card[52];// 要有52個位 , !!想問>>Card[]
    int idx = 0;
    for (int i = randomNumber; i < this.cards.length; i++) {
      temp[idx] = this.cards[i];
      idx++;
    }
    for(int i = 0; i <randomNumber;i++){
      temp[idx++] = this.cards[i];
    }
    this.cards=temp;

  }

  public void riffle() {

  }

  @Override
  public String toString(){
    return Arrays.toString(this.cards);
  }
  @Override
  public boolean equals(Object obj){
    if(this == obj)
    return true;
    if(!(obj instanceof Deck))
    return false;
    Deck deck = (Deck) obj;
    return Arrays.equals(deck.getCard(),this.cards);
  }
  @Override
  public int hashCode() { 
    return Objects.hash(this.cards);
  }
  public static void main(String[] args) {
    Deck D1 = pocker();
    D1.overhand();
    System.out.println(D1.toString());
  }
}
