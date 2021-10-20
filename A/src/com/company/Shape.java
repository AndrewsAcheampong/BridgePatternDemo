package com.company;

public abstract class Shape {

    //Shape takes an object of the Color interface as an attribute
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    //this is a class to be implemented by a subclass
    abstract public String draw();
}
