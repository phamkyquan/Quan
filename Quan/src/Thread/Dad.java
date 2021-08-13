/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread;

import OpenFile.OpenFile;
import java.util.ArrayList;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC1
 */
public class Dad extends Thread {

    private final CyclicBarrier cyclicBarrier;
    private final Queue queue;

    public Dad(CyclicBarrier cyclicBarrier, Queue queue) {
        this.cyclicBarrier = cyclicBarrier;
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
            cyclicBarrier.await();
        } catch (Exception ex) {
        }
    }

}
