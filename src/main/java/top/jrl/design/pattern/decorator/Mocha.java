package top.jrl.design.pattern.decorator;

/**
 * Mocha 调料（具体装饰者）
 *
 * @author jrl
 * @date Create in 14:57 2022/10/23
 */
public class Mocha extends CondimentDecorator {
    // 把被装饰者实例传进来
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Mocha";
    }

    @Override
    public double cost() {
        // 根据不同的杯型，加摩卡的价格不同
        switch (beverage.getSize()) {
            case "tall":
                return .20 + beverage.cost() + .10;
            case "grande":
                return .20 + beverage.cost() + .15;
            case "venti":
                return .20 + beverage.cost() + .20;
            default:
                return .20 + beverage.cost();
        }
    }
}
