/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread;

import OpenFile.OpenFile;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
/**
 *
 * @author PC1
 */
public class Dad extends Thread {

    private final CountDownLatch latch;
    private final Queue queue;

    public Dad(CountDownLatch latch, Queue queue) {
        this.latch = latch;
        this.queue = queue;
    }

    @Override
    public void run() {
        ArrayList<String> a = OpenFile.openFile("D:\\NetBeans\\FILE\\Quan\\dad.dat");
        if (a.get(1).equals("21")) {
            try {
                queue.putDem();
            } catch (Exception ex) {
            }
        }
        try {
            latch.countDown();
        } catch (Exception ex) {
        }
    }

}
