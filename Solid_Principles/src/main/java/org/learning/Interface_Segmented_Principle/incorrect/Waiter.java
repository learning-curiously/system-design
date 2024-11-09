package org.learning.Interface_Segmented_Principle.incorrect;

public class Waiter implements RestaurantEmployee{
    @Override
    public void washDishes() {
        //not my work
    }

    @Override
    public void serveCustomers() {

    }

    @Override
    public void cookFood() {
        //not my work
    }
}


/*
* INTERFACE SEGMENTED PRINCIPLE - Interfaces should be such, that client should not implement unnecessary functions
* that they do not need, but here in above example it is getting violated...as washDishes and cookFood are not waiter functions
* but as they are part of the interface, we have to implement them in class.
*/