/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread;

import OpenFile.OpenFile;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC1
 */
public class UBND extends Thread{

    private boolean ketqua;

    public boolean isKetqua() {
        return ketqua;
    }
    
    @Override
    public void run() {
        ArrayList<String> a = OpenFile.openFile("D:\\NetBeans\\FILE\\Quan\\UBND.dat");
        try {
            int age = OpenFile.calculateAge(a.get(5));
            if(age==21){
                ketqua = true;
            }
        } catch (Exception ex) {
        }
    }
    
}