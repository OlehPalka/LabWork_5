package store;

import Decorators.Item;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
public class FlowerBucket extends Item {
    List<FlowerPack> flowerPacks = new ArrayList<FlowerPack>();

    public void AddPack (FlowerPack pack) {
        flowerPacks.add(pack);
    }

    public double getPrice() {
        double price = 0;
        for (FlowerPack pack : flowerPacks) {
            price += pack.getPrice();
        }
        return price;
    }

    @Override
    public void getDescription() {
        System.out.println(this);
    }
}
