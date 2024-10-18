package org.example.comparable;

import java.util.List;

public class Count {
    public int countSuits(Suit s, List<PlayCard> list){
        int qty = 0;
        for(PlayCard p: list) if (p.getSuit()==s) qty++;
        return qty;
    }
    public int countRank(Rank r, List<PlayCard> list){
        int qty = 0;
        for(PlayCard p: list) if (p.getRank() == r) qty++;
        return qty;
    }

    public Object countObj(PlayCard plc, List<PlayCard> list){
        int qty = 0;
        for(PlayCard p: list) if (p.equals(plc)) qty++;
        return qty;
    }

}
