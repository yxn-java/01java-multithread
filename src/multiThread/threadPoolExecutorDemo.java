package multiThread;

import java.util.concurrent.*;
//测试ThreadPoolExecutor线程池生成器
public class threadPoolExecutorDemo {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(5, 50, 10, TimeUnit.SECONDS,
                new ArrayBlockingQueue<Runnable>(50),
                new ThreadFactory(){ public Thread newThread(Runnable r) {
                    return new Thread(r, "schema_task_pool_" + r.hashCode());
                }}, new ThreadPoolExecutor.DiscardOldestPolicy());
            //测试线程池
            int a = 1;
            //callable
            Future<Boolean> future = threadPool.submit(new Callable<Boolean>(){
                @Override
                public Boolean call() throws Exception {
                    int b = a + 100;
                    System.out.println(b);
                    return true;
                }
            });
            try {
                System.out.println("feature.get");
                Boolean boolean1 = future.get();
                System.out.println(boolean1);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException...");
                e.printStackTrace();
            } catch (ExecutionException e) {
                System.out.println("execute exception...");
                e.printStackTrace();
            }

    }
}
