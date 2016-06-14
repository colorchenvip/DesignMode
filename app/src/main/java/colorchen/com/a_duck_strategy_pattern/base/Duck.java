package colorchen.com.a_duck_strategy_pattern.base;

import colorchen.com.a_duck_strategy_pattern.FlyBehavior;
import colorchen.com.a_duck_strategy_pattern.SpeakBehavior;

/**
 * Created by color on 16/3/16 18:27.
 */
public abstract class Duck {
    public FlyBehavior flyBehavior;
    public SpeakBehavior speakBehavior;

    public Duck() {
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performSpeak() {
        speakBehavior.speak();
    }

    public void swim() {
        System.out.printf("所有的鸭子，都会游泳！！\n");
    }

    public void setSpeakBehavior(SpeakBehavior speakBehavior) {
        this.speakBehavior = speakBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
