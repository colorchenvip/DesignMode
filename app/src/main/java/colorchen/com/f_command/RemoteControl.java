package colorchen.com.f_command;

import colorchen.com.f_command.interf.Command;

/**
 * Created by color on 16/6/14 18:10.
 */
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl(int num) {
        this.onCommands = new Command[num];
        this.offCommands = new Command[num];

        Command noCommand = new NoCommand();
        for (int i = 0; i < num; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot,Command onCommand,Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonPushed(int slot){
        onCommands[slot].execute();
    }

    public void offButtonPushed(int slot){
        offCommands[slot].execute();
    }


    public String toString(){
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n-----  remote control --------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot"+i+"]"+onCommands[i].getClass().getName()+"   "+offCommands[i].getClass().getName()+"\n");
        }
        return stringBuff.toString();
    }
}
