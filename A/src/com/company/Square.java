package com.company;

//refined Abstraction
public class Square extends Shape{

//the method in the Shape class, inherited by the square(a subclass of Shape)

    @Override
    public String draw() {
        return "Square drawn. " + color.fill();
    }


    //Unique method
//    public String rotate(){
//        return "The shape has been rotated";
//    }
}
