package top.jrl.design.pattern.behavior.strategy;

/**
 * @author jrl
 * @date Create in 18:49 2022/11/11
 */
public class Base0 {
    InterfaceA b;
    void one(InterfaceA a) {
        a.hello();
        b.hello();
    }
}
