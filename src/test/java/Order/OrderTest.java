package Order;

import User.Receiver;
import User.Sender;
import User.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class OrderTest {
    private Order order;
    private User user;
    private User user2;

    @BeforeEach
    void setUp() {
        order = new Order();
        user = new Receiver();
        user2 = new Sender();
        order.addUser(user);
        order.addUser(user2);
    }

    @Test
    void addUser() {
        assertEquals(2, order.getUsers().size());
    }

    @Test
    void removeUser() {
        order.removeUser(user);
        assertEquals(1, order.getUsers().size());
    }

    @Test
    void order() {
    }
}