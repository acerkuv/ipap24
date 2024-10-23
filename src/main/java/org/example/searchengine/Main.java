package org.example.searchengine;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        Read read = new Read("input.txt");
        read.readFile();

    }
}
