package top.jrl.design.pattern.creation.factory.abstract_;

/**
 * 具体产品类
 *
 * @author jrl
 * @date Create in 16:24 2023/1/20
 */
public class ClamPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        this.name = "clams";
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name + " from " + ingredientFactory.getName());
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.creatCheese();
        clam = ingredientFactory.createClams();
    }
}
