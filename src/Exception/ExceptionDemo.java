package Exception;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            throw new Exception("My Exception"); //抛出新的错误My Exception
        } catch (Exception e) {
            System.err.println("Caught Exception");//输出Caught Exception
            System.err.println("getMessage():" + e.getMessage());
            System.err.println("getLocalizedMessage():"
                    + e.getLocalizedMessage());
            System.err.println("toString():" + e);
            System.err.println("printStackTrace():");
            e.printStackTrace();
        }
    }
}
