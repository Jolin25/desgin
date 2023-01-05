package top.jrl.design.principle.IOP;

/**
 * @author jrl
 * @date Create in 23:01 2022/11/12
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack!!!");
    }
}
