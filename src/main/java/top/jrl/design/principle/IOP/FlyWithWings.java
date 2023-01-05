package top.jrl.design.principle.IOP;

/**
 * @author jrl
 * @date Create in 23:01 2022/11/12
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I`m flying!!!");
    }
}
