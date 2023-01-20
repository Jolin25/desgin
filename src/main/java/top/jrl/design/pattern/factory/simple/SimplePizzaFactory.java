package top.jrl.design.pattern.factory.simple;

/**
 * 简单工厂：负责创建具体对象
 *
 * @author jrl
 * @date Create in 13:47 2023/1/20
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("cheese".equals(type)) {
            pizza = new CheesePizza();
        } else if ("veggie".equals(type)) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
