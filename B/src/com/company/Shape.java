package com.company;

public abstract class Shape {
    protected DrawAPI drawAPI;

    //Shape Constructor
    protected Shape (DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }

    public abstract void draw();

}
