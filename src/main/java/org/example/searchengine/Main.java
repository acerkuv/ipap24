package org.example.searchengine;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;

public class Main {
    public static void main(String[] args) throws IOException {
        Read read = new Read("input.txt");
        read.readFile();


    }
}
