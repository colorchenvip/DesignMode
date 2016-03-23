package colorchen.com.b_observer;

import colorchen.com.b_observer.base.DisplayElement;
import colorchen.com.b_observer.base.ObserverFather;
import colorchen.com.b_observer.base.SubjectFather;

/**
 * 观察者的实现类
 * Created by color on 16/3/23 14:36.
 */
public class CurrentConditionDisplay implements ObserverFather, DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;
    private SubjectFather weatherData;


    public CurrentConditionDisplay(SubjectFather subjectFather) {
        this.weatherData = subjectFather;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }


    @Override
    public void display() {
        System.out.printf("现在的天气:" + "气温=" + temperature + "; " +
                "湿度=" + humidity + "; " +
                "压力" + pressure + ";\n");
    }


    public void show() {
        System.out.printf("CurrentConditionDisplay:" +
                "自己的show方法;");
    }
}
