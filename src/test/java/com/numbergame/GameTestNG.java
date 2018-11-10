package com.numbergame;

import org.testng.annotations.*;

public class GameTestNG {

    @BeforeClass
    public void setUp() {
        // code that will be invoked when this test is instantiated
    }

    @Test(groups = { "game" })
    public void simpleGame() {
        System.out.println("simpleGame test");
    }

    @Test(groups = { "game" })
    public void advancedGame() {
        System.out.println("advancedGame test");
    }

}
