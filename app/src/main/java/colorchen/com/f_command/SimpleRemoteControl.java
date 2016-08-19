package colorchen.com.f_command;

import colorchen.com.f_command.interf.Command;

/**
 * Created by color on 16/6/14 17:16.
 */
public class SimpleRemoteControl {
    Command slot;
    public SimpleRemoteControl(){

    }

    public void setCommand(Command command) {
        this.slot = command;
    }

    public void buttonPressed(){
        slot.execute();
    }
}
