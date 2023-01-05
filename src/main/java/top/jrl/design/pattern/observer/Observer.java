package top.jrl.design.pattern.observer;

/**
 * 观察者(订阅者）
 *
 * @author jrl
 * @date Create in 13:23 2023/1/5
 */
public interface Observer {
    /**
     * 用于接收主题发送的信息
     *
     * @param temp     温度
     * @param humidity 湿度
     * @param pressure 气压
     */
    void update(float temp, float humidity, float pressure);
}
