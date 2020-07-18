package com.mashibing.tank;


/**
 * created by: 小健
 *
 * @DATE: 2020/7/18 11:33
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        TankFrame tf = new TankFrame();

        while(true){
            Thread.sleep(50);
            tf.repaint();
        }
    }

}
