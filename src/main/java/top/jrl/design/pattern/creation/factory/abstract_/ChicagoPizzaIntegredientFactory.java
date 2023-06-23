package top.jrl.design.pattern.creation.factory.abstract_;

import top.jrl.design.pattern.creation.factory.abstract_.ingredient.*;
import top.jrl.design.pattern.factory.abstract_.ingredient.*;

/**
 * @author jrl
 * @date Create in 16:04 2023/1/20
 */
public class ChicagoPizzaIntegredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new VeryThinCrust();
    }

    @Override
    public Sauce createSauce() {
        return new BruschettaSauce();
    }

    @Override
    public Cheese creatCheese() {
        return new GoatCheese();
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
        return new FrozenClams();
    }

    @Override
    public String getName() {
        return "Chicago";
    }
}
