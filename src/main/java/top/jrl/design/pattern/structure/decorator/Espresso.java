package top.jrl.design.pattern.structure.decorator;

/**
 * Espresso（具体组件类）
 *
 * @author jrl
 * @date Create in 15:39 2022/10/23
 */
public class Espresso extends Beverage {
    public Espresso(String size) {
        description = "Espresso";
        this.size = size;
    }

    @Override
    public double cost() {
        return 1.99;
    }

}
