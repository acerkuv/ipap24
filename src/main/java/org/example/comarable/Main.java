package org.example.comarable;

import java.security.Key;
import java.sql.Array;
import java.util.*;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        List<PlayCard> cards = new ArrayList<>(Arrays.asList(
                new PlayCard(Rank.QUEEN, Suit.HEARTS), new PlayCard(Rank.JACK, Suit.HEARTS),
                new PlayCard(Rank.ACE, Suit.CLUBS), new PlayCard(Rank.KING, Suit.HEARTS),
                new PlayCard(Rank.QUEEN, Suit.DIAMONDS), new PlayCard(Rank.JACK, Suit.HEARTS),
                new PlayCard(Rank.KING, Suit.HEARTS), new PlayCard(Rank.KING, Suit.HEARTS)
        ));

        // Сортировка по масти SUIT
        System.out.println("Сортировка по SUIT\n");
        Collections.sort(cards);
        for (PlayCard p : cards)
            System.out.println(p.toString());

        System.out.println("\n >... next ... >\n");

        //Cортирока по весу карт Rank
        System.out.println("Сортировка по Rank\n");
        Collections.sort(cards, new CustomComparing());
        for (PlayCard p: cards)
            System.out.println(p.toString());


        System.out.println("\n");

        //Сколько Королей
        int qtyKings =  cards.stream()
                .mapToInt(a->{
                            int i = 0;
                            if (a.getRank()==Rank.KING) i++;
                            return i;
                        }).sum();

        System.out.println("Королей в колоде " + qtyKings);

        //Сколько карт масти черви "Hearts"

        int qtyHearts =  cards.stream()
                .mapToInt(a->{
                            int i = 0;
                            if (a.getSuit()==Suit.HEARTS) i++;
                            return i;
                        }).sum();

        System.out.println("Карт масти черви в колоде " + qtyHearts);

        }


    }


