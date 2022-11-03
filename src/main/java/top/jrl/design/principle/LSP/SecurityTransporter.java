// package top.jrl.design.principle.LSP;
//
// /**
//  * 符合LSP的子类：
//  * （里式替换是一种设计原则，是用来指导继承关系中子类该如何设计的，
//  * 子类的设计要保证在替换父类的时候，不改变原有程序的逻辑以及不破坏原有程序的正确性）
//  * <p>
//  * <p>
//  * 子类 SecurityTransporter 继承父类 Transporter，增加了额外的功能，支持传输 appId 和 appToken 安全认证信息。
//  *
//  * @author jrl
//  * @date Create in 21:11 2022/4/30
//  */
// public class SecurityTransporter extends Transporter {
//     private String appId;
//     private String appToken;
//
//     public SecurityTransporter(HttpClient httpClient, String appId, String appToken) {
//         super(httpClient);
//         this.appId = appId;
//         this.appToken = appToken;
//     }
//
//     @Override
//     public Response sendRequest(Request request) {
//         if (StringUtils.isNotBlank(appId) && StringUtils.isNotBlank(appToken)) {
//             request.addPayload("app-id", appId);
//             request.addPayload("app-token", appToken);
//         }
//         return super.sendRequest(request);
//     }
// }
