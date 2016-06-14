package colorchen.com.b_observer;

import java.util.ArrayList;

import colorchen.com.b_observer.base.ObserverFather;
import colorchen.com.b_observer.base.SubjectFather;

/**
 * 主题的实现类（管理观察者的类）
 * Created by color chen on 16/3/23 17:55.
 * @gitHub:www.github.com/colorchenvip
 */
public class WeatherData implements SubjectFather {

    private ArrayList<ObserverFather> observers;//观察者队列
    private float temperature;//温度
    private float humidity;//湿度
    private float pressure;//压力

    public WeatherData(){
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(ObserverFather o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(ObserverFather o) {
        int i = observers.indexOf(o);
        if (i>0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            ObserverFather observerFather = observers.get(i);
            observerFather.update(temperature,humidity,pressure);
        }
    }

    /**
     * 通知所有注册观察者
     */
    public void measurementsChanged(){
        notifyObserver();
    }

    /**
     * 设置要更新的参数
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
