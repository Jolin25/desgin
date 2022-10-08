package top.jrl.design.principle.LSP;


/**
 * 父类 Transporter 使用 org.apache.http 库中的 HttpClient 类来传输网络数据
 *
 * @author jrl
 * @date Create in 21:03 2022/4/30
 */
public class Transporter {
    private HttpClient httpClient;

    public Transporter(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public Response sendRequest(Request request) { // ...use httpClient to send request
    }
}
