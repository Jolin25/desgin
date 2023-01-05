package top.jrl.design.principle.IOP;

/**
 * @author jrl
 * @date Create in 23:08 2022/11/12
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
        mallard.swim();
        mallard.display();
    }
}
