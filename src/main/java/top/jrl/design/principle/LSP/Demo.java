package top.jrl.design.principle.LSP;

/**
 * @author jrl
 * @date Create in 21:14 2022/4/30
 */
public class Demo {
    public void demoFunction(Transporter transporter) {
        Reuqest request = new Request();
        //...省略设置request中数据值的代码...
        Response response = transporter.sendRequest(request);
        //...省略其他逻辑...
    }

    public static void main(String[] args) {
        // 里式替换原则
        Demo demo = new Demo();
        demo.demofunction(new SecurityTransporter(/*省略参数*/););
    }
}
