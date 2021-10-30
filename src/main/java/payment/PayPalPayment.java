package payment;

public class PayPalPayment implements Payment{

    @Override
    public boolean pay(double price) {
        System.out.println("Paid" + price + "with PayPal.");
        return true;
    }
}
