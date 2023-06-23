package top.jrl.design.pattern.creation.factory.abstract_;


/**
 * 抽象创建者：披萨总店
 *
 * @author jrl
 * @date Create in 13:03 2023/1/17
 */
public abstract class PizzaStore {
    /**
     * 工厂方法：将有子类来实现，以此决定具体要实例化的类
     *
     * @param type 披萨类型
     * @return Pizza 披萨
     * @date 2023/1/17
     */
    protected abstract Pizza createPizza(String type);

    /**
     * 加工披萨
     * 这个方法相当于是个框架，而 createPizza 既是工厂方法也是一个扩展点。
     *
     * @param type 披萨类型
     * @return Pizza 披萨
     * @date 2023/1/17
     */
    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;

    }
}
