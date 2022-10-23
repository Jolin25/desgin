package top.jrl.design.pattern.decorator;

/**
 * 调料(抽象装饰类)
 *
 * @author jrl
 * @date Create in 14:53 2022/10/23
 */
public abstract class CondimentDecorator extends Beverage { // 继承被装饰者
    /**
     * 所有的调料装饰者都要重新实现这个方法
     *
     * @return String 饮料描述
     * @author Joly
     * @date 2022/10/23
     */
    @Override
    public abstract String getDescription();

    /**
     * 该饮料的价格
     *
     * @return double 饮料价格
     * @author Joly
     * @date 2022/10/23
     */
    @Override
    public abstract double cost();
}
