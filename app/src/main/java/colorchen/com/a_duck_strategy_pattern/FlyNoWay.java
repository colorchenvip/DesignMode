package colorchen.com.a_duck_strategy_pattern;

/**
 * Created by color on 16/3/16 18:37.
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.printf("我不会飞----\n");
    }
}
