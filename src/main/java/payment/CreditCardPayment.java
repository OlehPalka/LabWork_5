package payment;

public class CreditCardPayment implements Payment{
    @Override
    public boolean pay(double price) {
        System.out.println("Paid" + price + "with credit card.");
        return true;
    }
}
