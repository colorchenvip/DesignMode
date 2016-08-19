package colorchen.com.f_command.model;

/**
 * Created by color on 16/6/14 17:20.
 */
public class LightModel extends Light {
    @Override
    public void on() {
        System.out.println("进屋要开灯哦");
    }

    @Override
    public void off() {
        System.out.println("妈妈说:出门要关灯");
    }
}
