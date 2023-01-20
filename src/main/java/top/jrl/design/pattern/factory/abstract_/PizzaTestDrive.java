package top.jrl.design.pattern.factory.abstract_;

/**
 * @author jrl
 * @date Create in 16:32 2023/1/20
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        NYPizzaStore nyPizzaStore = new NYPizzaStore();
        nyPizzaStore.orderPizza("cheese");

        ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        chicagoPizzaStore.orderPizza("cheese");

        chicagoPizzaStore.orderPizza("clam");
    }
}
