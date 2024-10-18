package org.example.comparable;

import java.util.Comparator;

public class CustomComparing implements Comparator<PlayCard> {
//    Cортировка по Rank
    @Override
    public int compare(PlayCard o1, PlayCard o2) {
        return o1.getRank().compareTo(o2.getRank());
    }


}
