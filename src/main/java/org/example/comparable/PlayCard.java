package org.example.comparable;

import java.util.Objects;

public class PlayCard implements Comparable<PlayCard> {
    private Rank rank;
    private Suit suit;

    public PlayCard(Rank rank, Suit suit) {
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

    public Suit getSuit() {
        return this.suit;
    }

    @Override
    public String toString() {
        return "{ Rank = " + this.rank
                + ", Suit = " + this.suit
                + "}";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlayCard playCard = (PlayCard) o;
        return rank == playCard.rank && suit == playCard.suit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rank, suit);
    }
}