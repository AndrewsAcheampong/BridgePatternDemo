package com.company;

public class Red implements Color{

    @Override
    public String fill() {
        return "Color the Shape red";
    }

    //Unique method
        public String lightRed(){
            return "Change color to light red";
        }

}
