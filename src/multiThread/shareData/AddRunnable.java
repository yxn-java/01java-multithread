package multiThread.shareData;

public class AddRunnable implements Runnable{
    MyData data;
    public AddRunnable(MyData data){
        this.data= data;
    }
    public void run() {
        data.add();
    }
}
