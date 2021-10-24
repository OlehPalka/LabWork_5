import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class FlowerBucket {
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
}
