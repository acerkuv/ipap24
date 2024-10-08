package org.example.guitar;

public class Main {
    public static void main(String[] args) {
        Guitar guitar = new Guitar();
        guitar.play();

        Piano piano = new Piano();
        piano.play();

        ClassiGuitar classiGuitar = new ClassiGuitar();
        classiGuitar.play();

        classiGuitar.setQtyStrings(7);
        System.out.println(classiGuitar.getQtyStrings());

    }
}
