package Thread;

import java.util.concurrent.Callable;

public abstract class BaseGetAgeProcessor implements Callable<Integer> {

    private int ageResult;

    @Override
    public Integer call() throws Exception{
        try {
            ageResult = getAgeOfQuan();
        } catch (Throwable ex) {
            ex.printStackTrace();
        }
        return ageResult;
    }

    public abstract int getAgeOfQuan();

}
