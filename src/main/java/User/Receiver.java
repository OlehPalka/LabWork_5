package User;

import lombok.Data;

@Data
public class Receiver implements User{
    private int id = 0;
    private String user_status = "___";

    @Override
    public void update() {
        this.user_status += "active";
        System.out.println(user_status);
    }

    @Override
    public void create_id() {
        this.id = (int) ((Math.random() * (9999 - 1000)) + 1000);
    }
}
