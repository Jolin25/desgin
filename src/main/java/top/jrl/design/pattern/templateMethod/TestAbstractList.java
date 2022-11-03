package top.jrl.design.pattern.templateMethod;

import java.util.AbstractList;

/**
 * AbstractList 的 addAll方法是模板方法，add方法是子类需要重写的方法
 *
 * @author jrl
 * @date Create in 16:37 2022/10/8
 */
public class TestAbstractList extends AbstractList<String> {
    public static void main(String[] args) {
        TestAbstractList testAbstractList = new TestAbstractList();
        //public void add(int index, E element) {
        //         throw new UnsupportedOperationException();
        // }
        // 哈哈哈哈 ，如果不重写的话，就会直接抛出父类方法里面写的异常。狗贼
        testAbstractList.add(0, "a");
        Object o = testAbstractList.get(0);
    }

    @Override
    public String get(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
