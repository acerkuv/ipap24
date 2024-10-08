package org.example.guitar;

public class ClassiGuitar extends Guitar{
    private int qtyStrings = 6;
    @Override
    public void play() {
        System.out.println("Flamenco");
    }

    public int getQtyStrings() {
        return qtyStrings;
    }

    public void setQtyStrings(int qtyStrings) {
        this.qtyStrings = qtyStrings;
    }
}
