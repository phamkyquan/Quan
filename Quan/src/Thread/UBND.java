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
public class UBND extends Thread {

    private final CountDownLatch latch;
    private final Queue queue;

    public UBND(CountDownLatch latch, Queue queue) {
        this.latch = latch;
        this.queue = queue;
    }

    @Override
    public void run() {
        ArrayList<String> a = OpenFile.openFile("D:\\NetBeans\\FILE\\Quan\\UBND.dat");
        try {
            int age = OpenFile.calculateAge(a.get(5));
            if (age == 21) {
                queue.putDem();
            }
        } catch (Exception ex) {
        }
        try {
            latch.countDown();
        } catch (Exception ex) {
        }
    }

}
