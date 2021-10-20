package com.company;

public class Bicycle extends Vehicle{

    public Bicycle(Workshop workshop1, Workshop workshop2) {
        super(workshop1, workshop2);
    }

    @Override
    public void manufacture() {
        System.out.println("Bicycle");
        workshop1.work();
        workshop2.work();
    }
}
