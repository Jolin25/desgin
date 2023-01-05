package top.jrl.design.principle.IOP;

/**
 * 绿头鸭
 *
 * @author jrl
 * @date Create in 22:58 2022/11/12
 */
public class MallardDuck extends Duck {
    /**
     * 在构造器中指定行为的具体实现类，这样呱呱叫就由Quack类来实现，fly也是类似的
     *
     * @author Joly
     * @date 2022/11/12
     */
    public MallardDuck() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }

    @Override
    void display() {
        System.out.println("beautiful head~");
    }
}
