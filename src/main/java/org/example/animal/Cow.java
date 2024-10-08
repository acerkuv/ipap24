package org.example.animal;

public class Cow extends Animal{
    private int qtySpots;
    Cow(String name, int age, int qtySpots) {
        super(name, age);
        this.qtySpots = qtySpots;

    }

    public int getQtySpots() {
        return qtySpots;
    }

    public void setQtySpots(int qtySpots) {
        this.qtySpots = qtySpots;
    }
    @Override
    public  String toString(){
        return "Меня зовут " + getName() + " мне " + getAge() +
                " лет и у меня " + getQtySpots() + " пятен";
    }


    public boolean equals(Cow cow) {
        if(getName().equals(cow.getName()) &&
                (getAge() == cow.getAge())) return true;
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }


}
