package top.jrl.design.pattern.structure.decorator;

/**
 * HouseBlend（具体组件）
 *
 * @author jrl
 * @date Create in 15:00 2022/10/23
 */
public class HouseBlend extends Beverage {
    public HouseBlend(String size) {
        this.description = "House Blend Coffee";
        this.size = size;
    }

    @Override
    public double cost() {
        return .89;
    }

}
