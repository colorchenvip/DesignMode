package colorchen.com.b_observer.base;

/**
 * 主题-出版社
 * Created by color on 16/3/23 13:59.
 */
public interface SubjectFather {

    public void registerObserver(ObserverFather o);

    public void removeObserver(ObserverFather o);

    public void notifyObserver();
}
