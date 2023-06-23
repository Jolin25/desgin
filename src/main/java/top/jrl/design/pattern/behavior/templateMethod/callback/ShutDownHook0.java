package top.jrl.design.pattern.behavior.templateMethod.callback;

/**
 * 学习 hook 来实现 模板方法模式
 * @author jrl
 * @date Create in 15:45 2022/10/10
 */
public class ShutDownHook0 {
    public static void main(String[] args) {
        Runtime.getRuntime().addShutdownHook(  // 这个就是 hook
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("shut down hook ");
                    }
                })
        );
    }
}
