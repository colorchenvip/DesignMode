package colorchen.com.a_duck;


import colorchen.com.a_duck.base.Duck;

/**
 * Created by color on 16/3/16 19:04.
 */
public class DuckModel extends Duck {
    public DuckModel() {
        flyBehavior = new FlyNoWay();
        speakBehavior = new SpeakSou();
    }

    @Override
    public void display() {
        System.out.printf("我是个模型鸭子\n");
    }
}
