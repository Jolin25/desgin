package top.jrl.design.pattern.creation.factory.method;

/**
 * 具体产品类：纽约奶酪披萨
 * @author jrl
 * @date Create in 13:22 2023/1/17
 */
public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        //薄皮面团
        dough = "Thin Crust Dough";
        //大蒜番茄酱
        sauce = "Marinara Sauce";
        //磨碎的reggiano高级干酪
        toppings.add("Grated Reggiano Cheese");
    }
}
