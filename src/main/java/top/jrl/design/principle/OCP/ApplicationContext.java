// package top.jrl.design.principle.OCP;
//
// /**
//  * ApplicationContext 是一个单例类，
//  * 负责 Alert 的创建、组装（alertRule 和 notification 的依赖注入）、
//  * 初始化（添加 handlers）工作。
//  *
//  * @author jrl
//  * @date Create in 15:07 2022/4/30
//  */
//
// public class ApplicationContext {
//     private AlertRule alertRule;
//     private Notification notification;
//     private Alert alert;
//
//     public void initializeBeans() {
//         alertRule = new AlertRule(/*.省略参数.*/); //省略一些初始化代码
//         notification = new Notification(/*.省略参数.*/); //省略一些初始化代码
//         alert = new Alert();
//         alert.addAlertHandler(new TpsAlertHandler(alertRule, notification));
//         alert.addAlertHandler(new ErrorAlertHandler(alertRule, notification));
//     }
//
//     public Alert getAlert() {
//         return alert;
//     }
//
//     // 饿汉式单例
//     private static final ApplicationContext instance = new ApplicationContext();
//
//     private ApplicationContext() {
//         initializeBeans();
//     }
//
//     public static ApplicationContext getInstance() {
//         return instance;
//     }
// }
//
//
