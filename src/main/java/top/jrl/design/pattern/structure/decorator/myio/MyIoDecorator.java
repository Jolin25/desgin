package top.jrl.design.pattern.structure.decorator.myio;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 我的 IO装饰者
 *
 * @author jrl
 * @date Create in 17:58 2022/10/23
 */
public class MyIoDecorator extends FilterInputStream {
    /**
     * Creates a <code>FilterInputStream</code>
     * by assigning the  argument <code>in</code>
     * to the field <code>this.in</code> so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or <code>null</code> if
     *           this instance is to be created without an underlying stream.
     */
    protected MyIoDecorator(InputStream in) {
        // 在FilterInputStream 里是把 in 给存下来了的。所以实例是知道的。
        super(in);
    }

    @Override
    public int read() throws IOException {
        // 调用 被装饰者的原始方法
        int c = super.read();
        //    装饰者添加行为
        return (c == -1 ? c : Character.toLowerCase(c));
    }

    @Override
    public int read(byte[] b, int offset, int len) throws IOException {
        int result = super.read(b, offset, len);
        for (int i = offset; i < offset + result; i++) {
            b[i] = (byte) Character.toLowerCase(b[i]);
        }
        return result;
    }
}
