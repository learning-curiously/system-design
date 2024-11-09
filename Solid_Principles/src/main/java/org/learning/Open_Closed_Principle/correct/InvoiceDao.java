package org.learning.Open_Closed_Principle.correct;

import org.learning.Single_Responsibility_Principle.correct.Invoice;

public interface InvoiceDao {

    public void save(Invoice invoice);
}

// Now u can create different classes extending this interface,....examples...savetoDB...saveToFile
//so let's say a new method comes saveToMongo..so u don't need to change saveToDB class or saveToFile class
// u can directly change in saveToMongo class...