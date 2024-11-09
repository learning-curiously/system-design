package org.learning.Single_Responsibility_Principle.incorrect;

import org.learning.Open_Closed_Principle.correct.InvoiceDao;
import org.learning.Single_Responsibility_Principle.correct.Invoice;

public class DatabaseInvoiceDao implements InvoiceDao {
    @Override
    public void save(Invoice invoice) {

    }
}
