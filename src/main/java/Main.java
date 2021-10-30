import Decorators.Item;
import Decorators.RibbonDecorator;
import Delivery.DHLDeliveryStrategy;
import payment.PayPalPayment;
import store.Flower;
import store.FlowerType;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Flower flower = new Flower(FlowerType.Tulip);
        DHLDeliveryStrategy dhl = new DHLDeliveryStrategy();
        PayPalPayment paypal = new PayPalPayment();
        List<Item> items = new ArrayList<>();
        items.add(flower);
        flower.setPrice(10);
        RibbonDecorator ribbon_flower = new RibbonDecorator(flower);
        System.out.println(ribbon_flower.getPrice());
        dhl.deliver(items);
        paypal.pay(ribbon_flower.getPrice());
    }
}
