package com.numbergame;

import org.testng.annotations.*;

public class GameTestNG {
    static final int pupilCount = 100;

    @BeforeClass
    public void setUp() {
        // code that will be invoked when this test is instantiated
    }

    @Test(groups = {"game"})
    public void gameStageOne() {
        System.out.println("Stage 1 of the number game for " + pupilCount + " pupils is forthcoming. Here is the full list:");

        for (int num = 1; num <= pupilCount; num++) {
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (num % 3 == 0) {
                System.out.println("Fizz");
            } else if (num % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(num);
            }
        }

        System.out.println("This is the end of the list.");
    }

    @Test(groups = {"game"})
    public void gameStageTwo() {
        System.out.println("Stage 2 of the number game for " + pupilCount + " pupils is forthcoming. Here is the full list:");

        for (int num = 1; num <= pupilCount; num++) {
            String num_str = String.valueOf(num);

            if ((num % 3 == 0 || num_str.contains("3")) && (num % 5 == 0 || num_str.contains("5"))) {
                System.out.println("FizzBuzz");
            } else if (num % 3 == 0 || num_str.contains("3")) {
                System.out.println("Fizz");
            } else if (num % 5 == 0 || num_str.contains("5")) {
                System.out.println("Buzz");
            } else {
                System.out.println(num);
            }
        }

        System.out.println("This is the end of the list.");
    }
}