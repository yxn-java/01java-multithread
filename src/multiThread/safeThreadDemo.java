package multiThread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class safeThreadDemo {
    public static void main(String[] args) {
        safeThread thread=new safeThread();
        thread.run();
        Lock lock=new ReentrantLock();
    }
}
