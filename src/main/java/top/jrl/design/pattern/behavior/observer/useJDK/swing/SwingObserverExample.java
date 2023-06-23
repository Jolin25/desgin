package top.jrl.design.pattern.behavior.observer.useJDK.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author jrl
 * @date Create in 18:47 2023/1/5
 */
public class SwingObserverExample {
    JFrame jFrame;

    public static void main(String[] args) {
        SwingObserverExample swingObserverExample = new SwingObserverExample();
        swingObserverExample.go();
    }

    private void go() {
        JFrame jFrame = new JFrame();

        JButton jButton = new JButton("should I do it?");
        jButton.addActionListener(new AngelListener());
        jButton.addActionListener(new DevilListener());
        jFrame.getContentPane().add(BorderLayout.CENTER, jButton);
        // 唔.... 啥子都没看到，应该还要设置 JFrame 的各种属性.....
    }

    private class AngelListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Do it!");
        }
    }

    private class DevilListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Don`t do it,you might regret it!");
        }
    }
}
