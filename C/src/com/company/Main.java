package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // So an object of the abstract class is created and Initialised with it's implementor
        // and because the Interface is referenced in the abstract class, the method implemented
        // by the implementors of the Interface is accessed.

        Vehicle vehicle = new Car(new Produce(), new Assembly());
        Vehicle vehicle1 = new Car(new Produce(), new Assembly());
        vehicle.manufacture();
        vehicle1.manufacture();

    }
}
