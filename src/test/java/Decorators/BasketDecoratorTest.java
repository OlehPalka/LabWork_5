package Decorators;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import store.Flower;
import store.FlowerType;

import static org.junit.jupiter.api.Assertions.*;

class BasketDecoratorTest {
    private static Item decorator;

    @BeforeAll
    static void beforeAll() {
        Flower flower = new Flower(FlowerType.Tulip);
        flower.setPrice(20);
        decorator = new BasketDecorator(flower);
    }

    @Test
    void getPrice() {
        assertEquals(24, decorator.getPrice());
    }


}