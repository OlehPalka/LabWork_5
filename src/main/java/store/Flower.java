package store;

import Decorators.Item;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;

@Getter @Setter
@ToString
public class Flower extends Item {
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

    @Override
    public void getDescription() {
        System.out.println(this);
    }
}
