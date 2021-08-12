/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quan;

import Thread.*;

/**
 *
 * @author PC1
 */
public class test {

    public static void main(String[] args) {
        Queue queue = new Queue();
        Dad dad = new Dad(queue);
        Mom mom = new Mom(queue);
        UBND ubnd = new UBND(queue);
        mom.start();
        dad.start();
        ubnd.start();
        queue.start();
    }

}
