package top.jrl.design.pattern.creation.factory.method;

/**
 * 具体产品类：芝加哥奶酪披萨
 *
 * @author jrl
 * @date Create in 13:22 2023/1/17
 */
public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Sauce and Cheese Pizza";
        //超厚皮面团
        dough = "Extra Thick Crust Dough";
        //梅子番茄酱
        sauce = "Plum Tomato Sauce";
        //马苏里拉奶酪丝
        toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    void cut() {
        //切成正方形
        System.out.println("Cutting the pizza into square slice");
    }
}
