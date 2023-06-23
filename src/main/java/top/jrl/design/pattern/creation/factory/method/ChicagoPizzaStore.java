package top.jrl.design.pattern.creation.factory.method;

/**
 * 芝加哥披萨店：具体创建者
 * @author jrl
 * @date Create in 13:30 2023/1/17
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        }
        if (type.equals("clam")) {
            // 这里本应该返回 new Clam（），但是我没有创建这个类
            return null;
        }
        return null;
    }
}
