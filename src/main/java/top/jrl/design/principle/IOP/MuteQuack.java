package top.jrl.design.principle.IOP;

/**
 * @author jrl
 * @date Create in 23:05 2022/11/12
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
