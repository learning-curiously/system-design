package org.learning.Interface_Segmented_Principle.correct;

public class waiter implements WaiterInterface{
    @Override
    public void serveCustomers() {
        System.out.println("serving the customer");
    }

    @Override
    public void takeOrder() {
        System.out.println("taking orders");
    }
}
