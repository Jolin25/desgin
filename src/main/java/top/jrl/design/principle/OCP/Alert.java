// package top.jrl.design.principle.OCP;
//
// import java.util.ArrayList;
// import java.util.List;
//
// /**
//  * @author jrl
//  * @date Create in 14:51 2022/4/30
//  */
// public class Alert {
//
//     private List alertHandlers = new ArrayList<>();
//
//     public void addAlertHandler(AlertHandler alertHandler) {
//         this.alertHandlers.add(alertHandler);
//     }
//
//     /*第一部分是将 check() 函数的多个入参封装成 ApiStatInfo 类；*/
//     public void check(ApiStatInfo apiStatInfo) {
//         //第二部分是引入 handler 的概念，将 if 判断逻辑分散在各个 handler 中
//         for (AlertHandler handler : alertHandlers) {
//             handler.check(apiStatInfo);
//         }
//     }
// }
