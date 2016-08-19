package colorchen.com.g_adapter.duck;

/**
 * 野鸭子 实现类
 * Created by color on 16/6/15 15:15.
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("嘎嘎。。。");
    }

    @Override
    public void fly() {
        System.out.println("我会飞了");
    }
}
