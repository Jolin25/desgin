package top.jrl.design.pattern.behavior.observer.useJDK;


import java.util.Observable;
import java.util.Observer;

/**
 * @author jrl
 * @date Create in 16:35 2023/1/5
 */
public class CurrentConditionsDisplayJDK implements Observer, DisplayElement {
    private float temperature;
    private float humidity;

    private Observable weatherDataJDK;

    public CurrentConditionsDisplayJDK(Observable weatherDataJDK) {
        this.weatherDataJDK = weatherDataJDK;
        weatherDataJDK.addObserver(this);
    }


    @Override
    public void display() {
        System.out.println("Current conditions:" + temperature + "C degrees and " + humidity + "% humidity");
    }

    /**
     * 采用了拉模式来实现
     */
    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherDataJDK) {
            WeatherDataJDK weatherDataJDK = (WeatherDataJDK) o;
            this.temperature = weatherDataJDK.getTemperature();
            this.humidity = weatherDataJDK.getHumidity();
            display();
        }
    }
}
