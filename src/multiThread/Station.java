package multiThread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

import static java.lang.Thread.sleep;

public class Station extends Thread{
    static CountDownLatch countDownLatch;
    Object lock  = "lock";
//    static int tick = 20;//保持多个站台线程间票量一直要用static
    static AtomicInteger tick = new AtomicInteger(20);//保持多个站台线程间票量一直要用static
    public Station(String name, CountDownLatch countDownLatch){
        super(name);//给线程命名
        this.countDownLatch = countDownLatch;
    }


    @Override
    public void run(){
//        while(tick > 0){
        while(tick.get() > 0){

            synchronized (lock){
//                if(tick > 0){
                if(tick.get() > 0){
                    int i = tick.getAndDecrement();
                    System.out.println(getName() + " 卖出了第" + tick  + "张票" );
//                    tick--;
                    //System.out.println("剩下 " + tick + " 张票" );
                }else {
                    System.out.println("票卖完了");
                }
                try {
                    sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
        countDownLatch.countDown();
    }
}
