package colorchen.com.a_duck.test;

import colorchen.com.a_duck.DuckModel;
import colorchen.com.a_duck.FlyWithWing;
import colorchen.com.a_duck.SpeakMute;
import colorchen.com.a_duck.base.Duck;

/**
 * 策略模式 鸭子demo
 * Created by color on 15/10/29 16:22.
 */
public class Test {
    public static void main(String[] args){
        Duck duck = new DuckModel();
        duck.display();//打印出来 造出来一直鸭子
        duck.performFly();//
        duck.setSpeakBehavior(new SpeakMute());//设置鸭子沉默
        duck.performSpeak();//打印出来让鸭子沉默
        duck.setFlyBehavior(new FlyWithWing());//设置让鸭子会费
        duck.performFly();//打印出来"你"飞

    }
}
