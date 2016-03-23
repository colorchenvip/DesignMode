package colorchen.com.a_duck.test;

import colorchen.com.a_duck.DuckModel;
import colorchen.com.a_duck.FlyWithWing;
import colorchen.com.a_duck.SpeakMute;
import colorchen.com.a_duck.base.Duck;

/**
 * Created by color on 15/10/29 16:22.
 */
public class Test {
    public static void main(String[] args){
        Duck duck = new DuckModel();
        duck.display();
        duck.performFly();//
        duck.setSpeakBehavior(new SpeakMute());
        duck.performSpeak();
        duck.setFlyBehavior(new FlyWithWing());
        duck.performFly();

    }
}
