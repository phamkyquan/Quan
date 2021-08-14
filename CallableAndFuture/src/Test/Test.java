package Test;

import Thread.*;
import java.util.ArrayList;
import java.util.List;
import WriteFile.WriteFile;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        List<Future<Integer>> arr = new ArrayList<>();
        
        ExecutorService executor = Executors.newFixedThreadPool(3);
        
        Dad dad = new Dad();
        Mom mom = new Mom();
        UBND ubnd = new UBND();
        
        Future<Integer> future;
        
        future = (Future<Integer>) executor.submit(mom);
        arr.add(future);
        future = (Future<Integer>) executor.submit(dad);
        arr.add(future);
        future = (Future<Integer>) executor.submit(ubnd);
        arr.add(future);
        
        //Đóng ThreadPool
        executor.shutdown();

        // kiem tra ket qua
        int count = 0;
        for (Future<Integer> processor : arr) {
            if (processor.get() == 21) {
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
