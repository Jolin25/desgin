package top.jrl.design.pattern.observer;

/**
 * 主题
 *
 * @author jrl
 * @date Create in 13:23 2023/1/5
 */
public interface Subject {
    /**
     * 注册订阅本主题的观察者
     *
     * @param o 观察者
     * @author Joly
     * @date 2023/1/5
     */
    void registerObserver(Observer o);

    /**
     * 注销订阅了本主题的观察者
     *
     * @param o 观察者
     * @author jrl
     * @date 2023/1/5
     */
    void removeObserver(Observer o);

    /**
     * 通知所有订阅了本主题的观察者
     * (推模式)
     *
     * @date 2023/1/5
     */
    void notifyObserver();
}
