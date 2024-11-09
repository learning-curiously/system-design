package org.learning.Liskov_Substitution_Principle;

public class Bicycle implements Bike{

    int speed;

    @Override
    public void turnOnEngine() throws Exception {
        throw new Exception("Bicycle has no engine");
    }

    @Override
    public void accelerate() {
        speed = speed + 10;
    }
}


/*
* LISKOV SUBSTITUTION PRINCIPLE -- If class B is subtype of class A, then we should be able to replace
* object of A with B without breaking the behavior of the program. Subclass should extend the capability of
* parent class not narrow it down..
*
* Now what happens here is that turnOnEngine functionality is not appropriate for bicycle so we are throwing an
* exception for this...which is not in terms of Liskov Substitution principle...as we are narrowing down the functionality
* for bike interface.
* */