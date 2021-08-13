package Interface.Impl;

import Interface.IGetAgeProcessor;
import java.util.concurrent.CyclicBarrier;

public abstract class BaseGetAgeProcessor implements Runnable, IGetAgeProcessor {

    private final CyclicBarrier cyclicBarrier;
    private int ageResult;

    public BaseGetAgeProcessor(CyclicBarrier cyclicBarrier) {
        this.cyclicBarrier = cyclicBarrier;
    }

    @Override
    public void run() {
        try {
            ageResult = getAgeOfQuan();
        } catch (Throwable ex) {
            ex.printStackTrace();
        } finally {
            try {
                cyclicBarrier.await();
            } catch (Throwable ex) {
                ex.printStackTrace();
            }
        }
    }

    @Override
    public int getAge() {
        return ageResult;
    }

    public abstract int getAgeOfQuan();

}
