package com.company;

public class RedCircle implements DrawAPI{

    // RedCircle as a class implements the methods in the Interface class
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[color: red, radius: " + radius + " , X: " + x +", y: " + y + " ]");
    }
}
