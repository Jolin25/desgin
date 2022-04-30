package top.jrl.design.principle.OCP.old;

/**
 * 其中，AlertRule 存储告警规则，可以自由设置。
 * Notification 是告警通知类，支持邮件、短信、微信、手机等多种通知渠道。
 * NotificationEmergencyLevel 表示通知的紧急程度，
 * 包括 SEVERE（严重）、URGENCY（紧急）、NORMAL（普通）、TRIVIAL（无关紧要），
 * 不同的紧急程度对应不同的发送渠道。
 * 关于 API 接口监控告警这部分，更加详细的业务需求分析和设计，
 * 我们会在后面的设计模式模块再拿出来进一步讲解，这里你只要简单知道这些，就够我们今天用了。
 *
 * @author jrl
 * @date Create in 14:27 2022/4/30
 */

public class Alert {
    private AlertRule rule;
    private Notification notification;

    public Alert(AlertRule rule, Notification notification) {
        this.rule = rule;
        this.notification = notification;
    }

    /**
     * 业务逻辑主要集中在 check() 函数中。
     * 当接口的 TPS 超过某个预先设置的最大值时，
     * 以及当接口请求出错数大于某个最大允许值时，就会触发告警，通知接口的相关负责人或者团队。
     *
     * @param
     * @return
     * @date 2022/4/30
     */
    public void check(String api, long requestCount, long errorCount, long durationOfSeconds) {
        long tps = requestCount / durationOfSeconds;
        if (tps > rule.getMatchedRule(api).getMaxTps()) {
            notification.notify(NotificationEmergencyLevel.URGENCY, "...");
        }
        if (errorCount > rule.getMatchedRule(api).getMaxErrorCount()) {
            notification.notify(NotificationEmergencyLevel.SEVERE, "...");
        }
    }
}
