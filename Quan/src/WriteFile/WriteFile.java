/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WriteFile;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;

/**
 *
 * @author PC1
 */
public class WriteFile {
    
    public static void writeFileOutput() {
        FileWriter outFile;
        PrintWriter out;
        try {
            outFile = new FileWriter("D:\\NetBeans\\FILE\\Quan\\result.bin");
            out = new PrintWriter(outFile);
            out.write("Đúng");
            out.close();
            outFile.close();
        } catch (Exception e) {
        }
    }
}
