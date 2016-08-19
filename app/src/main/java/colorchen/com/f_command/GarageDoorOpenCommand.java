package colorchen.com.f_command;

import colorchen.com.f_command.interf.Command;
import colorchen.com.f_command.model.GarageDoor;

/**
 * Created by color on 16/6/14 17:54.
 */
public class GarageDoorOpenCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.open();
    }
}
