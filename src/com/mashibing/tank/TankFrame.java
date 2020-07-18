package com.mashibing.tank;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * created by: 小健
 *
 * @DATE: 2020/7/18 11:49
 */
public class TankFrame extends Frame {
    int x = 400,y = 300;

    public TankFrame() throws HeadlessException {
        setSize(800,600); //设置窗口大小
        setResizable(false); //设置不可调整窗口大小
        setTitle("tank war"); //设置窗口栏信息
        setVisible(true);//设置是否显示窗口

        this.addKeyListener(new MyKeyListener());

        //设置窗口可关闭
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
    @Override
    public void paint(Graphics g) {
        g.fillRect(x,y,50,50);//在窗口内画一个黑方块（xy是位置，50/50是大小）
        x +=1;
    }

    class MyKeyListener extends KeyAdapter{


        @Override
        //键盘被按下去的时候调用
        public void keyPressed(KeyEvent e) {

        }

        @Override
        //键盘弹起来的时候被调用
        public void keyReleased(KeyEvent e) {
        }
    }
}
