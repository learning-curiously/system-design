package org.learning.Open_Closed_Principle.incorrect;

import org.learning.Single_Responsibility_Principle.incorrect.Invoice;

public class InvoiceDao {

    Invoice invoice;

    public InvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToDB() {
        //Save into the DB
    }

    public void saveToFile(String filename) {
        //Save invoice in the File with the given name
    }
}

//Now this is wrong, u are allowed to extend the saveToDB feature but not allowed to add new feature or
// modify the class, because by doing this this class is now more prone to bugs
