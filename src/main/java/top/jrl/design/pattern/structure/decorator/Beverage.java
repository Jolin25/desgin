package top.jrl.design.pattern.structure.decorator;

/**
 * 饮料类
 *
 * @author jrl
 * @date Create in 14:50 2022/10/23
 */
public abstract class Beverage {
    String description = "Unknown Beverage";
    // 容量大小，调料会根据咖啡容量收费
    String size = "Unknown Size";

    /**
     * 该饮料的价格
     *
     * @author Joly
     * @date 2022/10/23
     */
    public abstract double cost();

    public String getDescription() {
        return description;
    }

    public String getSize() {
        return size;
    }
}
