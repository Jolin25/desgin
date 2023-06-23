package top.jrl.design.pattern.behavior.templateMethod;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 去看看 InputStream 的 read方法 使用模板方法模式
 * @author jrl
 * @date Create in 12:10 2022/10/8
 */
public class Test {
    public static void main(String[] args) throws IOException {
        byte[] src = new byte[10];
        for (int i = 0; i < src.length; i++) {
            src[i] = (byte) (i % 127);
        }
        InputStream inputStream = new ByteArrayInputStream(src);
        byte[] des = new byte[1024];
        // 这个read方法是InputStream的模板方法
        // int read = inputStream.read(des);
        // 这个read方法是InputStream暴露给子类来定制的抽象方法
        int read = inputStream.read();
        System.out.println(read);
        for (int i = 0; i < read ; i++) {
            System.out.println(des[i]);
        }
    }
}
