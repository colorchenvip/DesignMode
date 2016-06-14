package colorchen.com.a_duck_strategy_pattern;


import colorchen.com.a_duck_strategy_pattern.base.Duck;

/**
 * 鸭子的实现类
 * Created by color chen on 16/3/23 17:55.
 * @gitHub:www.github.com/colorchenvip
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
