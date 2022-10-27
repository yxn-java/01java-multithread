package multiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class newCachedThreadPoolDemo {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService threadPool= Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            final int index = i;
            Thread.sleep(index * 1000);
            threadPool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(index + " 当前线程：" + Thread.currentThread().getName() + "当前任务时间："
                            + System.currentTimeMillis());
                }
            });
        }
    }
}
