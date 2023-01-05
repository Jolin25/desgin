package top.jrl.design.pattern.observer.useJDK;

import top.jrl.design.pattern.observer.WeatherData;

import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

/**
 * @author jrl
 * @date Create in 16:38 2023/1/5
 */
public class WeatherStationJDK {
    public static void main(String[] args) {
        // 天气主题（可观察者）
        WeatherDataJDK weatherDataJDK = new WeatherDataJDK();
        // 观察者
        Observer currentConditionsDisplayJDK = new CurrentConditionsDisplayJDK(weatherDataJDK);

        // 开始测试

        // 信息源说：“我变了！我变了！”
        weatherDataJDK.setMeasurements(16, 30, 95.6f);


    }
}
