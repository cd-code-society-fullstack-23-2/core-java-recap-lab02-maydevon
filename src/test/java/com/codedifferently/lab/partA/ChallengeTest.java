package com.codedifferently.lab.partA;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChallengeTest {
    @Test
    public void testOne(){
        Challenge algoProblem12 = new Challenge();

        int[] expected ={10, 30, 50, 60};
        int[] input = {10, 3, 5, 6};
        int[] actual = algoProblem12.multiplesOfTens(input);

        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    public void testTwo(){
        Challenge algoProblem12 = new Challenge();

        int[] expected = {70, 20, 10, 90};
        int[] input = {7, 2, 10, 9};
        int[] actual = algoProblem12.multiplesOfTens(input);

        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    public void testThree(){
        Challenge algoProblem12 = new Challenge();

        int[] expected = {20};
        int[] input = {2};
        int[] actual = algoProblem12.multiplesOfTens(input);

        Assertions.assertArrayEquals(expected,actual);
    }
}
