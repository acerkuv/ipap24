package org.example.comparable;

import java.util.*;

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

        int t = 0;
        for (PlayCard p: cards){
            if(p.getRank()==Rank.QUEEN) t++;
        }
        System.out.println("Королев " + t + "\n");


        long qtyAce =  cards.stream().filter(playCard -> playCard.getRank()==Rank.ACE).count();
        System.out.println("ТУЗЫ!!"  + qtyAce);


//     Другие методы подсчета полей и объектов с помощью тдельно класса
        Count count = new Count();
        System.out.println("Сколько тузов в колоде " + count.countRank(Rank.ACE, cards));

        System.out.println(" Сколько королей черви в колоде " +
                count.countObj(new PlayCard(Rank.KING, Suit.HEARTS), cards));


        }


    }


