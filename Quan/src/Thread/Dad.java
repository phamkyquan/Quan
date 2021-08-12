/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread;

import OpenFile.OpenFile;
import java.util.ArrayList;

/**
 *
 * @author PC1
 */
public class Dad extends Thread {

    private final Queue queue;

    public Dad(Queue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        ArrayList<String> a = OpenFile.openFile("D:\\NetBeans\\FILE\\Quan\\dad.dat");
        if (a.get(1).equals("21")) {
            try {
                queue.put();
            } catch (Exception ex) {
            }
        }
        queue.putSum();
    }

}
