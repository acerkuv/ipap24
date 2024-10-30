package org.example.streams;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {


    @Test
    void checkMessageMy() {

        String[] strings = {"Good", "morning", "my", "dear", "friend", "i", "am",
                "glad to see", "you"};

        String[] result= {"morning",  "friend",  "glad to see" };
        Assertions.assertArrayEquals(result, Main.checkMessage(strings));
    }

    @Test
    void countNumbers() {
        int[] numbers = {1, 3, 50, 7, 14, 25, 190, 1, 0, -10};
        Assertions.assertEquals(5, Main.countNumbers(numbers));
    }

    @Test
    void sumNumbers() {
        ArrayList <Integer> numb2 = new ArrayList<>(List.of(1, 3, 4, 7, 8, 10, 22, 44, 3, 7, 99));
        Assertions.assertEquals(218, Main.sumNumbers(numb2));
    }
}