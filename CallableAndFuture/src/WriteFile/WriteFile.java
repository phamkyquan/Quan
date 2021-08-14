package WriteFile;

import java.io.FileWriter;
import java.io.PrintWriter;

public class WriteFile {
    
    public static void writeFileOutput(String str) {
        FileWriter outFile;
        PrintWriter out;
        try {
            outFile = new FileWriter("D:\\NetBeans\\FILE\\Quan\\result.bin");
            out = new PrintWriter(outFile);
            out.write(str);
            out.close();
            outFile.close();
        } catch (Exception e) {
        }
    }
}
