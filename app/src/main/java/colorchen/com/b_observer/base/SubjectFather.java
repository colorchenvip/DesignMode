package colorchen.com.b_observer.base;

/**
 * 主题-出版社
 * 这里是主题接口,对象使用此接口注册为观察者,或者把自己从观察者用删除
 * Created by color on 16/3/23 13:59.
 */
public interface SubjectFather {

    public void registerObserver(ObserverFather o);

    public void removeObserver(ObserverFather o);

    public void notifyObserver();
}
