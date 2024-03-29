package top.jrl.design.pattern.creation.factory.abstract_;

import top.jrl.design.pattern.creation.factory.abstract_.ingredient.*;
import top.jrl.design.pattern.creation.factory.abstract_.ingredient.*;

/**
 * @author jrl
 * @date Create in 14:23 2023/1/20
 */
public interface PizzaIngredientFactory {
    Dough createDough();

    Sauce createSauce();

    Cheese creatCheese();

    Veggies[] createVeggies();

    Pepperoni createPepperoni();

    Clams createClams();

    String getName();
}
