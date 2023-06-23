package top.jrl.design.pattern.creation.factory.abstract_;

/**
 * 具体产品类
 * CheesePizza：NY 和 Chicago 风味的是不同的原料，所以要使用不同的原料工厂。
 * 这里采用组合的方式将原料工厂置入。（很像简单工厂）
 *
 * @author jrl
 * @date Create in 16:21 2023/1/20
 */
public class CheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        this.name = "cheese pizza";
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name + " from "+ingredientFactory.getName());
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.creatCheese();
    }
}
