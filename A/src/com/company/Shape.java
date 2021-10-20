package com.company;

public abstract class Shape {

    //Shape takes an object of the Color interface as an attribute
    protected Color color;


    //This constructor takes the color object as a parameter, and that makes it possible
    //for the shape object that will be created to receive an object of the color as an argument
    public Shape(Color color) {
        this.color = color;
    }



    //this is a class to be implemented by a subclass
    abstract public String draw();
}
