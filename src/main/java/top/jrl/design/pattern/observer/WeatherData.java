package top.jrl.design.pattern.observer;

import java.util.ArrayList;

/**
 * WeatherData 当天气信息变化时，会通知订阅了本主题的观察者们
 *
 * @author jrl
 */
public class WeatherData implements Subject {
    /**
     * 订阅了本主题的观察者们
     */
    private ArrayList<Observer> observers;

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    /**
     * 通知每个观察者，天气信息改变了
     */
    @Override
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update(temperature, humidity, pressure);
        }
    }

    /**
     * 这个方法是 WeatherData 特有的，当天气的信息变化了之后，就会调用
     * {@link WeatherData#notifyObserver()} 来通知观察者们
     */
    public void measurementsChanged() {
        notifyObserver();
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
}
