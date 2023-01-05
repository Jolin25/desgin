package top.jrl.design.principle.IOP;

/**
 * @author jrl
 * @date Create in 23:07 2022/11/12
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can`t fly");
    }
}
