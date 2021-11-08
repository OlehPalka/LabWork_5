package Order;

import User.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Order {
    private List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public void notifyUsers(){
        for (User user : users) {
            user.update();
        }
    }

    public void order() {
        notifyUsers();
    }

    public static Order QuickOrder(){
        Order order = new Order();
        Receiver user = new Receiver();
        Sender user2 = new Sender();
        order.addUser(user);
        order.addUser(user2);
        return order;
    }
}
