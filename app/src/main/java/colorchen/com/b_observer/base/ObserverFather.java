package colorchen.com.b_observer.base;

/**
 * 订阅者-观察者
 * 所有潜在的观察者必须实现观察者接口,这个借口只有update一个方法,当主题状态改变是被调用
 * Created by color on 16/3/23 14:03.
 */
public interface ObserverFather {
    public void update(float temp,float humidity,float pressure);
}
