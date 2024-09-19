// 1. Single Responsibility Principle (SRP): A class should have only one reason to change, meaning
//                                           it should have only one job or responsibility.

// Violation of SRP
class Invoice {
    public void calculateTotal() {
        // logic to calculate total
    }
    public void printInvoice() {
        // logic to print the invoice
    }
    public void saveToDatabase() {
        // logic to save invoice to database
    }
}

// Problem: Invoice class violates the SRP because it has more than one responsibility. SRP states that a class should
//          have only one reason to change, which means that the class should focus on one responsibility or task.
// Solution: You can break the Invoice class into multiple classes, each with a single responsibility:

class InvoiceCalculator {
    public void calculateTotal() {
        // logic to calculate total
    }
}

class InvoicePrinter {
    public void printInvoice() {
        // logic to print the invoice
    }
}

class InvoiceRepository {
    public void saveToDatabase() {
        // logic to save invoice to the database
    }
}
