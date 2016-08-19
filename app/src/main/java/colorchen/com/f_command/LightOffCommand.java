package colorchen.com.f_command;

import colorchen.com.f_command.interf.Command;
import colorchen.com.f_command.model.Light;

/**
 * 实现一个关闭电灯的命令
 * Created by color on 16/6/14 17:08.
 */
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
