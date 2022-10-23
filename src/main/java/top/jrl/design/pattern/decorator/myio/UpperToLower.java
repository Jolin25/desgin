package top.jrl.design.pattern.decorator.myio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * 测试 MyIoDecorator
 *
 * @author jrl
 * @date Create in 17:57 2022/10/23
 */
public class UpperToLower {
    public static void main(String[] args) throws IOException {

        String path = "D:\\Desktop\\test.txt";
        InputStream in = new MyIoDecorator(new FileInputStream(path));
        int c;
        while ((c = in.read()) != -1) {
            System.out.println((char) c);
        }
    }
}
