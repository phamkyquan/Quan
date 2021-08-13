/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quan;

import Thread.*;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

/**
 *
 * @author PC1
 */
public class test {

    public static void main(String[] args) throws InterruptedException, BrokenBarrierException{
        CountDownLatch latch = new CountDownLatch(3);
        Queue queue = new Queue();
        Dad dad = new Dad(latch, queue);
        Mom mom = new Mom(latch, queue);
        UBND ubnd = new UBND(latch, queue);
        mom.start();
        dad.start();
        ubnd.start();
        latch.await();
        queue.end();
    }

}
