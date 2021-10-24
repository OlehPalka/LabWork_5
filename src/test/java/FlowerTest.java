import static org.junit.jupiter.api.Assertions.*;

class FlowerTest {
    private Flower flower;
    private int[] color = {0, 120, 4};

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.Rose);
        flower.setColor(color);
    }

    @org.junit.jupiter.api.Test
    void setColor() {
        assertEquals(color[0], flower.getColor()[0]);
        assertEquals(color[1], flower.getColor()[1]);
        assertEquals(color[2], flower.getColor()[2]);
    }
}