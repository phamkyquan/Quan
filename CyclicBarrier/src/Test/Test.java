package Test;

import Interface.IGetAgeProcessor;
import Thread.*;
import java.util.ArrayList;
import java.util.List;
import WriteFile.WriteFile;
import java.util.concurrent.CyclicBarrier;

public class Test {

    public static void main(String[] args) {

        final CyclicBarrier barrier = new CyclicBarrier(4);
        Dad dad = new Dad(barrier);
        Mom mom = new Mom(barrier);
        UBND ubnd = new UBND(barrier);

        List<IGetAgeProcessor> arr = new ArrayList<>();
        arr.add(dad);
        arr.add(mom);
        arr.add(mom);

        new Thread(dad).start();
        new Thread(mom).start();
        new Thread(ubnd).start();

        // wait
        try {
            barrier.await();
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
