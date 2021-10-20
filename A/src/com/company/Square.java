package com.company;

public class Square extends Shape{

    //The square constructor, which is an inheritor of the methods in the Square class..
    //automatically inherits the constructor
    public Square(Color color) {
        super(color);
    }


    //the method in the Shape class, inherited by the square(a subclass of Shape)
    @Override
    public String draw() {
        return "Square drawn. " + color.fill();
    }
}
