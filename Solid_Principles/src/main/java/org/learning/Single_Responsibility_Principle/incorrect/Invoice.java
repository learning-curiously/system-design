package org.learning.Single_Responsibility_Principle.incorrect;

import org.learning.Single_Responsibility_Principle.Marker;

public class Invoice {

    private Marker marker;
    private int quantity;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public int calculateTotal() {
        int price = ((marker.price) * this.quantity);
        return price;
    }

    public void printInvoice() {
        //print the invoice
    }
    public void saveToDB() {
        //Save the data into DB
    }
}
// Now there are 3 reasons for this class to change,

// 1. calculation logic change
// 2. print method change
// 3. saveToDB method change

// In correct folder, each class has only one reason to change