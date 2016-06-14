package colorchen.com.a_duck_strategy_pattern;

/**
 * FlyBehavior的实现类
 * Created by color on 16/3/16 18:34.
 */
public class FlyWithWing implements FlyBehavior {
    @Override
    public void fly() {
        System.out.printf("我能用翅膀展翅高飞了。。。\n");
    }
}
