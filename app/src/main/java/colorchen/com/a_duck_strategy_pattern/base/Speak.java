package colorchen.com.a_duck_strategy_pattern.base;

import colorchen.com.a_duck_strategy_pattern.SpeakBehavior;

/**
 * Created by color on 16/3/16 18:48.
 */
public class Speak implements SpeakBehavior {
    @Override
    public void speak() {
        System.out.printf("嘎嘎的叫\n");
    }
}
