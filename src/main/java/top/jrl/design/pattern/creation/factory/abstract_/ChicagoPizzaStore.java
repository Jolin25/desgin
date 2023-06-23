package top.jrl.design.pattern.creation.factory.abstract_;


/**
 * @author jrl
 * @date Create in 16:27 2023/1/20
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        ChicagoPizzaIntegredientFactory pizzaIngredientFactory = new ChicagoPizzaIntegredientFactory();
        if ("cheese".equals(type)) {
            return new CheesePizza(pizzaIngredientFactory);
        }
        if ("clam".equals(type)) {
            return new ClamPizza(pizzaIngredientFactory);
        }
        return null;
    }
}
