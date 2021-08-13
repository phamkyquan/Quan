/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread;

import WriteFile.WriteFile;

/**
 *
 * @author PC1
 */
public class Queue extends Thread {

    private int dem = 0;

    public int getDem() {
        return dem;
    }

    public void putDem(){
        dem++;
    }
    
    public void submit(){
        if (dem == 3) {
            System.out.println("Output result.bin....");
            WriteFile.writeFileOutput();
        } else {
            System.out.println("Sai");
        }
    }
}
