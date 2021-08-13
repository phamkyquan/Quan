/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quan;

import Thread.*;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 *
 * @author PC1
 */
public class test {

    public static void main(String[] args) throws InterruptedException, BrokenBarrierException{
        final CyclicBarrier barrier = new CyclicBarrier(4);
        final Queue queue = new Queue();
        Dad dad = new Dad(barrier, queue);
        Mom mom = new Mom(barrier, queue);
        UBND ubnd = new UBND(barrier, queue);
        mom.start();
        dad.start();
        ubnd.start();
        barrier.await();
        queue.submit();
    }

}
