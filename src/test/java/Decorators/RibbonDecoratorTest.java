package Decorators;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import store.Flower;
import store.FlowerType;

import static org.junit.jupiter.api.Assertions.*;

class RibbonDecoratorTest {

    private static Item decorator;

    @BeforeAll
    static void beforeAll() {
        Flower flower = new Flower(FlowerType.Tulip);
        flower.setPrice(20);
        decorator = new RibbonDecorator(flower);
    }

    @Test
    void getPrice() {
        assertEquals(60, decorator.getPrice());
    }
}