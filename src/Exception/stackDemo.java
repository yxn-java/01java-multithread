package Exception;

public class stackDemo {
    public static void main (String args[]){
        int array[]={20,20,40};
        int num1=15,num2=10;
        int result=10;
        try{
            result = num1/num2;
            System.out.println("The result is" +result); //输出15整除10的结果；
            for(int i =5;i >=0; i--) {  //定义操作空间5比数组长度3大，会报错
                System.out.println("The value of array is"
                        +array[i]);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
