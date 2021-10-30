package Delivery;

import Decorators.Item;

import java.util.List;

public class PostDeliveryStrategy implements Delivery {

    @Override
    public void deliver(List<Item> items) {
        System.out.println("Your order will be delivered by post.");
    }
}
