package Test;

import Interface.IGetAgeProcessor;
import Thread.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import WriteFile.WriteFile;
import WriteFile.WriteFile;

public class Test {

    public static void main(String[] args) {

        final CountDownLatch latch = new CountDownLatch(3);
        Dad dad = new Dad(latch);
        Mom mom = new Mom(latch);
        UBND ubnd = new UBND(latch);

        List<IGetAgeProcessor> arr = new ArrayList<>();
        arr.add(dad);
        arr.add(mom);
        arr.add(mom);

        new Thread(dad).start();
        new Thread(mom).start();
        new Thread(ubnd).start();

        // wait
        try {
            latch.await();
        } catch (Throwable ex) {
            ex.printStackTrace();
        }

        // kiem tra ket qua
        int count = 0;
        for (IGetAgeProcessor processor : arr) {
            if (processor.getAge() == 21) {
                count++;
            }
        }
        System.out.println("Output result.bin.......");
        if(count == 3){
            WriteFile.writeFileOutput("Đúng");
        }
        else{
            WriteFile.writeFileOutput("Sai");
        }

    }

}
