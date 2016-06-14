package colorchen.com.a_duck_strategy_pattern;

/**
 * Created by color on 16/3/16 18:49.
 */
public class SpeakMute implements SpeakBehavior {
    @Override
    public void speak() {
        System.out.printf("沉默、、、、\n");
    }
}
