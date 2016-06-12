package colorchen.com.b_observer.test;

import colorchen.com.b_observer.CurrentConditionDisplay;
import colorchen.com.b_observer.WeatherData;


/**
 * Created by color on 16/3/23 14:52.
 */
public class Test {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(81, 66, 30.5f);
        weatherData.setMeasurements(82, 67, 30.6f);

        currentConditionDisplay.show();

        /*  现在的天气:气温=80.0; 湿度=65.0; 压力30.4;
            现在的天气:气温=81.0; 湿度=66.0; 压力30.5;
            现在的天气:气温=82.0; 湿度=67.0; 压力30.6;
            CurrentConditionDisplay:自己的show方法;*/
    }
}