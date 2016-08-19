package colorchen.com.f_command;

import colorchen.com.f_command.interf.Command;
import colorchen.com.f_command.model.Stereo;

/**
 * Created by color on 16/6/14 18:30.
 */
public class StereoOnWithCDCommand implements Command {
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }
}
