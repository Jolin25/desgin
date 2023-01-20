package top.jrl.design.pattern.factory.abstract_;

import top.jrl.design.pattern.factory.abstract_.ingredient.*;

import java.util.ArrayList;

/**
 * 抽象产品类：披萨概览
 *
 * @author jrl
 * @date Create in 13:04 2023/1/17
 */
public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies[] veggies;
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;

    /**
     * 在这个方法中需要根据不同的门店来使用不同原料工厂提供的原料来准备披萨，所以这是个抽象方法。
     */
    abstract void prepare();

    void bake() {
        //在350度的温度下烤25分钟
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        //把披萨切成对角线的薄片
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }
}
