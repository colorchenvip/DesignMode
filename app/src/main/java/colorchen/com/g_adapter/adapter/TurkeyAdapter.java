package colorchen.com.g_adapter.adapter;

import colorchen.com.g_adapter.duck.Duck;
import colorchen.com.g_adapter.turkey.Turkey;

/**
 * Created by color on 16/6/15 15:23.
 */
public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
