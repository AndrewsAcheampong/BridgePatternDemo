package com.company;

//Abstraction
public abstract class Shape {

    //Shape takes an object of the Color interface as an attribute
    protected Color color;



    //this is a class to be implemented by a subclass
    abstract public String draw();


    //extended functionality
    public String rotate(){
        return "Shape rotated";

    };

}

