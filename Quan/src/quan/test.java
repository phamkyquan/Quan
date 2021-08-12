/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quan;

import Thread.*;
import java.text.ParseException;
import WriteFile.WriteFile;

/**
 *
 * @author PC1
 */
public class test {

    public static void main(String[] args) throws ParseException, InterruptedException {
        Dad dad = new Dad();
        Mom mom = new Mom();
        UBND ubnd = new UBND();
        mom.start();
        dad.start();
        ubnd.start();
        
        Thread.sleep(100);
        while(true){
            if(mom.isKetqua()&&dad.isKetqua()&&ubnd.isKetqua()){
                System.out.println("Output result.bin....");
                WriteFile.writeFileOutput();
                break;
            }
        }
        
    }

}
