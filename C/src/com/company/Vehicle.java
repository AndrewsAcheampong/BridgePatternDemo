package com.company;

public abstract class Vehicle {
    protected Workshop workshop1;
    protected Workshop workshop2;

    public Vehicle(Workshop workshop1, Workshop workshop2){
        this.workshop1 = workshop1;
        this.workshop2 = workshop2;
    }

    public abstract void manufacture();

    //So an Interface is created, and then implementor of the Interface is created as well
    //An abstract class is created, and then interface is referenced in the absract class,
    //without interacting with the implementors of the Interface

    //Inheritors of the Abstract class is created and hence, because an object of the
    //interface has been created in the abstract class, it automatically gets access to
    //the methods being implemented by the implementors of the

}
