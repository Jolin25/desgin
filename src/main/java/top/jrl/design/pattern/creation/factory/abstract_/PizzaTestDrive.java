package top.jrl.design.pattern.creation.factory.abstract_;

/**
 * @author jrl
 * @date Create in 16:32 2023/1/20
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();
        pizzaStore.orderPizza("cheese");

        PizzaStore pizzaStore1 = new ChicagoPizzaStore();
        pizzaStore1.orderPizza("cheese");

        pizzaStore1.orderPizza("clam");
    }
}
