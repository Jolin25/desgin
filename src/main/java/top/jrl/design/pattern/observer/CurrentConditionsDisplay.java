package top.jrl.design.pattern.observer;

/**
 * 目前状况公告板
 *
 * @author jrl
 * @date Create in 14:44 2023/1/5
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;

    /**
     * 天气主题，保留这个是为了方便进行订阅的注销
     */
    private Subject weatherSubject;

    public CurrentConditionsDisplay(Subject weatherSubject) {
        this.weatherSubject = weatherSubject;
        //!!! 原来这个时候就可以有实例能够传给别的方法了 !!!
        weatherSubject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions:" + temperature + "C degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
