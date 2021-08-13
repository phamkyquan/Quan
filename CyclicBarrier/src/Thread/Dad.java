package Thread;

import Interface.Impl.BaseGetAgeProcessor;
import OpenFile.OpenFile;
import java.util.ArrayList;
import java.util.concurrent.CyclicBarrier;

public class Dad extends BaseGetAgeProcessor {

    public Dad(CyclicBarrier cyclicBarrier) {
        super(cyclicBarrier);
    }

    @Override
    public int getAgeOfQuan() {
        try {
            ArrayList<String> a = OpenFile.openFile("D:\\NetBeans\\FILE\\Quan\\dad.dat");
            return Integer.parseInt(a.get(1));
        } catch (Exception ex) {
            ex.printStackTrace();
            return 0;
        }
    }

}
