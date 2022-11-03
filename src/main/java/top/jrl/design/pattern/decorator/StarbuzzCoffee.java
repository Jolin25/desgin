package top.jrl.design.pattern.decorator;

/**
 * 演示
 *
 * @author jrl
 * @date Create in 15:33 2022/10/23
 */
public class StarbuzzCoffee {
    public static void main(String[] args) {
        // 来一杯双倍摩卡，一份奶泡的首选咖啡
        Beverage beverage = new HouseBlend("tall");
        // 此乃组合呀，一层一层的叠加上去
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);
        System.out.println(beverage.getDescription() + "$" + beverage.cost());

        // 双倍摩卡浓缩意式咖啡
        Beverage beverage1 = new Espresso("grande");
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        System.out.println(beverage1.cost());
    }
}
