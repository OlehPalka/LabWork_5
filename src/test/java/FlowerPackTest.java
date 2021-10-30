import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import store.Flower;
import store.FlowerPack;
import store.FlowerType;

import static org.junit.jupiter.api.Assertions.*;

class FlowerPackTest {
    private FlowerPack pack;

    @BeforeEach
    void setUp() {
        Flower flower = new Flower(FlowerType.Tulip);
        flower.setPrice(10);
        pack = new FlowerPack();
        pack.setFlower(flower);
        pack.setAmount(10);
    }

    @Test
    void getPrice() {
        assertEquals(100, pack.getPrice());
    }
}