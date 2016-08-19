package colorchen.com.f_command.test;

import colorchen.com.f_command.GarageDoorOpenCommand;
import colorchen.com.f_command.LightOffCommand;
import colorchen.com.f_command.LightOnCommand;
import colorchen.com.f_command.SimpleRemoteControl;
import colorchen.com.f_command.model.GarageDoor;
import colorchen.com.f_command.model.Light;
import colorchen.com.f_command.model.LightModel;

/**
 * Created by color on 16/6/14 17:19.
 */
public class Test {
    public static void main(String[] args) {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();

        Light light = new LightModel();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        remoteControl.setCommand(lightOnCommand);
        remoteControl.buttonPressed();

        LightOffCommand lightOffCommand = new LightOffCommand(light);
        remoteControl.setCommand(lightOffCommand);
        remoteControl.buttonPressed();

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand doorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        remoteControl.setCommand(doorOpenCommand);
        remoteControl.buttonPressed();


        /*
        test结果:
        进屋要开灯哦
        妈妈说:出门要关灯
        车库的门打开了*/
    }
}
