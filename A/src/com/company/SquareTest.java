package com.company;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @org.junit.jupiter.api.Test
    void whenBridgePatternInvoked_theConfigSuccess() {

        //An object(a typeof a square) of a square class being created
        Shape square = new Square(new Blue());


        //The test shows, when the method draw() is called,
        // the message on the right side must be the output
        assertEquals(square.draw(), "Square drawn. Color is Blue");
    }
}