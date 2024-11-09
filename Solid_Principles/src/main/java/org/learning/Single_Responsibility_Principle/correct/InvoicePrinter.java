package org.learning.Single_Responsibility_Principle.correct;

import org.learning.Single_Responsibility_Principle.incorrect.Invoice;

public class InvoicePrinter {

    private Invoice invoice;

    public InvoicePrinter(Invoice invoice) {
        this.invoice = invoice;
    }

    public void print(){

    }
}
