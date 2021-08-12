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
public class Mom extends Thread {

    private final Queue queue;

    public Mom(Queue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        ArrayList<String> a = OpenFile.openFile("D:\\NetBeans\\FILE\\Quan\\mom.dat");
        try {
            int age = OpenFile.calculateAge(a.get(2));
            if (age == 21) {
                queue.put();
            }
        } catch (Exception ex) {
        }
        queue.putSum();
    }

}
