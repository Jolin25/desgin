package top.jrl.design.pattern.factory.method;

/**
 * 测试类，换言之就是使用者
 *
 * @author jrl
 * @date Create in 13:34 2023/1/17
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        System.out.println(" Jolyne came into a NyPizzaStore and order a cheese pizza ...");
        PizzaStore pizzaStore = new NYPizzaStore();
        Pizza cheese = pizzaStore.orderPizza("cheese");
        System.out.println("Jolyne got her pizza:" + cheese.getName() + "!!!");

        System.out.println(" Jolyne came into a ChicagoPizzaStore and order a cheese pizza ...");
        PizzaStore pizzaStore1 = new ChicagoPizzaStore();
        Pizza cheese1 = pizzaStore1.orderPizza("cheese");
        System.out.println("Jolyne got her pizza:" + cheese1.getName() + "!!!");

    }
}
