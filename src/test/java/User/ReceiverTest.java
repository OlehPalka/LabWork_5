package User;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReceiverTest {
    private Receiver receiver;

    @BeforeEach
    void setUp() {
        receiver = new Receiver();
        receiver.update();
    }

    @Test
    void update() {
        assertEquals(receiver.getUser_status(), "___active");
    }
}