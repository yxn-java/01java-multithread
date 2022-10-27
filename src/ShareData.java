class ShareData
{
    private int x = 0;
    public synchronized void addx(){
        x++;
        System.out.println("x++ : "+x);
    }
    public synchronized void subx()
    { x--; System.out.println("x-- : "+x);
    }
}
