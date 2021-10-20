package com.company;

public class BridgePatternDemo {
    public static void main(String[] args) {

        Shape redCircle = new Circle(50, 60,5, new RedCircle());
        Shape greenCircle = new Circle(60, 70, 4, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
