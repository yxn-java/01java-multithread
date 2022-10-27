package multiThread;

import java.util.concurrent.CountDownLatch;
//concurrent实现3个线程调用
public class testThread {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(3);
        Station st1 = new Station("station 1",countDownLatch);
        Station st2 = new Station("station 2",countDownLatch);
        Station st3 = new Station("station 3",countDownLatch);
        long time = System.currentTimeMillis();
        st1.start();
        st2.start();
        st3.start();
        countDownLatch.await();
        System.out.println((System.currentTimeMillis() - time));

    }
}
