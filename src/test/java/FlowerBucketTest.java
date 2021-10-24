import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerBucketTest {
    private FlowerBucket bucket;

    @BeforeEach
    void setUp() {
        Flower tulip = new Flower(FlowerType.Tulip);
        tulip.setPrice(10);
        FlowerPack pack = new FlowerPack();
        pack.setFlower(tulip);
        pack.setAmount(10);

        Flower chamomile = new Flower(FlowerType.Chamomile);
        chamomile.setPrice(20);
        FlowerPack pack_2 = new FlowerPack();
        pack_2.setFlower(chamomile);
        pack_2.setAmount(5);

        bucket = new FlowerBucket();
        bucket.AddPack(pack);
        bucket.AddPack(pack_2);
    }

    @Test
    void addPack() {
        assertEquals(2, bucket.getFlowerPacks().size());
    }

    @Test
    void getPrice() {
        assertEquals(200, bucket.getPrice());
    }
}