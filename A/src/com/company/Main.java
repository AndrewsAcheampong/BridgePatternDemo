package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Previous Headache
        // Square square = new Square(new Blue());

        //create an object of the Square Class
        Square square = new Square();


        //color the square Blue
        square.color = new Blue();
        System.out.println(square.draw());


        //color the square Red
        square.color = new Red();
        System.out.println(square.draw());

        System.out.println(square.rotate());

        //casting of square to Red and not Color
        System.out.println(((Red)square.color).lightRed());













    }
}
