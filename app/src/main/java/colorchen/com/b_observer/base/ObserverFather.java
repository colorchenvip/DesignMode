package colorchen.com.b_observer.base;

/**
 * 订阅者-观察者
 * Created by color on 16/3/23 14:03.
 */
public interface ObserverFather {
    public void update(float temp,float humidity,float pressure);
}
