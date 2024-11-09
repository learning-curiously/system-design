package org.learning.Open_Closed_Principle;

import org.learning.Single_Responsibility_Principle.incorrect.Invoice;

public class InvoiceDao {

    Invoice invoice;

    public InvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToDB() {
        //Save into the DB
    }
}

//Let's say this code is tested and is being used heavily on production