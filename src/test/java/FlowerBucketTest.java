
import static org.junit.jupiter.api.Assertions.*;

class FlowerBucketTest {
    private FlowerBucket bucket;

    @org.junit.jupiter.api.BeforeEach
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

    @org.junit.jupiter.api.Test
    void addPack() {
        assertEquals(2, bucket.getFlowerPacks().size());
    }

    @org.junit.jupiter.api.Test
    void getPrice() {
        assertEquals(200, bucket.getPrice());
    }
}