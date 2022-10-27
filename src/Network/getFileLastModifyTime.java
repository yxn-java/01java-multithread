package Network;

import java.net.URL;
import java.net.URLConnection;

public class getFileLastModifyTime {
    public static void main(String[] argv)
            throws Exception {
        URL u = new URL("http://127.0.0.1:8080/BookStore/begin.jsp");
        URLConnection uc = u.openConnection();
        uc.setUseCaches(false);
        long timestamp = uc.getLastModified();
        System.out.println("begin.jsp 文件最后修改时间 :"+timestamp);
    }
}
