package colorchen.com.a_duck_strategy_pattern;

/**
 * Created by color on 16/3/16 18:54.
 */
public class SpeakSou implements SpeakBehavior {
    @Override
    public void speak() {
        System.out.printf("搜搜...\n");
    }
}
