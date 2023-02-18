package ums;

public class CreditCardPayment extends Payment {

    public CreditCardPayment(Product product, double amount) {
        super(product, amount);
    }
    
    public void displayAmount() {
        System.out.println("Payment amount: $" + getAmount());
    }
}