package top.jrl.design.pattern.decorator;

/**
 * 奶泡（具体装饰者）
 * @author jrl
 * @date Create in 15:26 2022/10/23
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Whip";
    }

    @Override
    public double cost() {
        return beverage.cost() + .10;
    }
}
