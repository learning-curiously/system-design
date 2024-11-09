package org.learning.Single_Responsibility_Principle.correct;

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
