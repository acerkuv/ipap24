package org.example.comparable;

public class PlayCard implements Comparable<PlayCard> {
    private Rank rank;
    private Suit suit;
    public PlayCard(Rank rank, Suit suit){
        this.rank = rank;
        this.suit = suit;
    }
    @Override
    public int compareTo(PlayCard o) {
       return this.getSuit().compareTo(o.getSuit());
    }

    public Rank getRank() {
        return this.rank;
    }
    public Suit getSuit(){
        return  this.suit;
    }
    @Override
    public String toString(){
        return "{ Rank = " + this.rank
                + ", Suit = " + this.suit
                 + "}";
    }
}
