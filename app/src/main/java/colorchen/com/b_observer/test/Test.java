package colorchen.com.b_observer.test;

import colorchen.com.b_observer.CurrentConditionDisplay;
import colorchen.com.b_observer.WeatherData;


/**
 * 观察者模式demo
 * Created by color on 16/3/23 14:52.
 */
public class Test {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();//首先拿到 管理观察者的类
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);//拿到 观察者的实现类
        weatherData.setMeasurements(80, 65, 30.4f);//设置变化参数  数据改变 相应注册了ObserverFather(订阅者-观察者) 观察者实现类 就会更新数据
        weatherData.setMeasurements(81, 66, 30.5f);
        weatherData.setMeasurements(82, 67, 30.6f);

        currentConditionDisplay.show();//观察者的实现类 自己展示数据

        /*
         test的结果如下:
            现在的天气:气温=80.0; 湿度=65.0; 压力30.4;
            现在的天气:气温=81.0; 湿度=66.0; 压力30.5;
            现在的天气:气温=82.0; 湿度=67.0; 压力30.6;
            CurrentConditionDisplay:自己的show方法;*/
    }
}