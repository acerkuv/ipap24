package org.example.animal;

public class Main {
    public static void main(String[] args) {
        Cow cow = new Cow("Буренка", 10, 120);
        System.out.println( cow.toString());

        Cow cow1 = new Cow("Буренка", 10, 120);

        System.out.println(cow.equals(cow1));
        System.out.println(cow.hashCode() + " " +cow1.hashCode());
    }
}
