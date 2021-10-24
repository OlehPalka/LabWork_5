import lombok.Data;
import lombok.ToString;

import java.util.Arrays;

@Data
@ToString
public class Flower {
    private double price;
    private double sepal_length;
    private int[] color;
    private FlowerType flowerType;

    public void setColor(int[] color) {
        this.color = Arrays.copyOf(color, color.length);
    }

    public Flower(FlowerType flowerType) {
        this.flowerType = flowerType;
    }
}