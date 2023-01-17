package top.jrl.design.pattern.factory.method;

/**
 * 具体创建者：纽约披萨店
 * @author jrl
 * @date Create in 13:30 2023/1/17
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        }
        if (type.equals("veggie")) {
            // 这里本应该返回 new Veggi（），但是我没有创建这个类
            return null;
        }
        return null;
    }
}
