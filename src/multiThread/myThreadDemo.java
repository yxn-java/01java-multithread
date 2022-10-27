package multiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class myThreadDemo {
    public static void main(String[] args) {
        //myThread thread1=new myThread();
        //thread1.run();
        ExecutorService pool= Executors.newFixedThreadPool(10);
        //for(int i=0;i<10;i++) {
        while(true){
            pool.execute(new Runnable() { // 提交多个线程任务，并执行
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + " is running ..");
                    System.out.println("Active threads:" +Thread.activeCount());
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }

    }
}
