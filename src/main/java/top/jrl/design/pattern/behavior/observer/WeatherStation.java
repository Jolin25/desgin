package top.jrl.design.pattern.behavior.observer;

/**
 * 测试程序
 *
 * @author jrl
 * @date Create in 14:54 2023/1/5
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(25, 50, 96.2f);
    }
}
