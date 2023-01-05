package top.jrl.design.principle.IOP;

/**
 * @author jrl
 * @date Create in 22:51 2022/11/12
 */
public abstract class Duck {
    /**
     * 把接口行为组合进来，这样就将具体实现推到了之后
     *
     * @author jrl
     * @date 2022/11/12
     */
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    void performQuack() {
        quackBehavior.quack();
    }

    void performFly() {
        flyBehavior.fly();
    }

    /**
     * 所有的 Duck 都统一的行为
     *
     * @date 2022/11/12
     */
    void swim() {
        System.out.println("I`m swimming ~");
    }

    /**
     * 展示这个行为就每种 Duck 自己去实现
     *
     * @date 2022/11/12
     */
    abstract void display();
}
