package top.jrl.design.pattern.factory.simple;

/**
 * @author jrl
 * @date Create in 13:54 2023/1/20
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
        Pizza pizza = pizzaStore.orderPizza("cheese");
    }
}
