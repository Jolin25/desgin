package top.jrl.design.principle.LSP;

/**
 * 不符合LSP的子类
 *
 * @author jrl
 * @date Create in 21:25 2022/4/30
 */
public class SecurityTransporterTwo extends Transporter {
    public SecurityTransporterTwo(HttpClient httpClient) {
        super(httpClient);
    }

    // 改造后：
    //...省略其他代码..
    @Override
    public Response sendRequest(Request request) {
        if (StringUtils.isBlank(appId) || StringUtils.isBlank(appToken)) {
            // 这里体现了不符合，在Transporter中，是不存在抛出异常的程序逻辑的。
            throw new NoAuthorizationRuntimeException(...);
        } request.addPayload("app-id", appId);
        request.addPayload("app-token", appToken);
        return super.sendRequest(request);
    }

}
