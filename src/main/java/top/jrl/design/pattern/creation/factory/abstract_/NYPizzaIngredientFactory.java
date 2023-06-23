package top.jrl.design.pattern.creation.factory.abstract_;

import top.jrl.design.pattern.creation.factory.abstract_.ingredient.*;
import top.jrl.design.pattern.factory.abstract_.ingredient.*;

/**
 * @author jrl
 * @date Create in 15:49 2023/1/20
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese creatCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {new Garlic(), new Onion()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }

    @Override
    public String getName() {
        return "NY";
    }
}
