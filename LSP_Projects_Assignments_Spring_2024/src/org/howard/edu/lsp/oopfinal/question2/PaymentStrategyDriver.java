package org.howard.edu.lsp.oopfinal.question2;

public class PaymentStrategyDriver {
    public static void main(String[] args) {
        // Creating instances of different payment strategies
        PaymentStrategy creditCard = new CreditCardPayment("1234-5678-9012-3456");
        PaymentStrategy paypal = new PayPalPayment("user@example.com");
        PaymentStrategy bitcoin = new BitcoinPayment("1AaBbCcDdEeFfGgHh");

        // Creating a shopping cart
        ShoppingCart cart = new ShoppingCart();

        // Using different payment strategies for checkout
        cart.setPaymentStrategy(creditCard);
        cart.checkout(100.0);

        cart.setPaymentStrategy(paypal);
        cart.checkout(50.0);

        cart.setPaymentStrategy(bitcoin);
        cart.checkout(75.0);
    }
}
