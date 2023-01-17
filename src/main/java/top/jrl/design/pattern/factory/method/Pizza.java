package top.jrl.design.pattern.factory.method;

import java.util.ArrayList;

/**
 * 抽象产品类：披萨概览
 *
 * @author jrl
 * @date Create in 13:04 2023/1/17
 */
public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<>(10);

    void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding topping:");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("    " + toppings.get(i));
        }
    }

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
}
