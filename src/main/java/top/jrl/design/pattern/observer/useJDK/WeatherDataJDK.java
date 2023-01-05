package top.jrl.design.pattern.observer.useJDK;

import top.jrl.design.pattern.observer.WeatherData;

import java.util.Observable;

/**
 * 天气主题
 *
 * @author jrl
 * @date Create in 16:32 2023/1/5
 */
public class WeatherDataJDK extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    /**
     * 主题微微一笑，说：“让我看看，等我们攒点数据再通知观察者们。”
     */
    public void measurementsChanged() {
        // 这个方法很好的体现了，观察者模式里面是有三个角色：
        // 信息源、主题、观察者
        if ("there is a condition..." != null) {
            setChanged();
        }
        notifyObservers();
    }

    /**
     * (这是业务规则）
     * 用于模拟天气信息的改变，改变的时候会调用 {@link WeatherData#measurementsChanged()}
     *
     * @param temp     温度
     * @param humidity 湿度
     * @param pressure 气压
     */
    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }


    // 拉模式
    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
