package multiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class newScheduledThreadPoolDemo {
    public static void main(String[] args) {
        ScheduledExecutorService threadPool= Executors.newScheduledThreadPool(3);
        //延迟三秒执行线程
        threadPool.schedule(new Runnable(){
            @Override
            public void run() {
                System.out.println("延迟三秒");
            }
        }, 3, TimeUnit.SECONDS);
        //延迟一秒后每隔三秒执行线程
        threadPool.scheduleAtFixedRate(new Runnable(){
            @Override
            public void run() {
                System.out.println("延迟三秒");
            }
        }, 1,3, TimeUnit.SECONDS);
    }
}
