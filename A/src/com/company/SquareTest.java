package com.company;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @org.junit.jupiter.api.Test
    void whenBridgePatternInvoked_theConfigSuccess() {

        Shape square = new Square(new Blue());

        assertEquals(square.draw(), "Square drawn. Color is Blue");
    }
}