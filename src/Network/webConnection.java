package Network;

import java.net.InetAddress;
import java.net.Socket;

public class webConnection {
    public static void main(String[] args) {
        try {
            InetAddress addr;
            Socket sock = new Socket("www.w3cschool.cn", 80);
            addr = sock.getInetAddress();
            System.out.println("连接到 " + addr);
            sock.close();
        } catch (java.io.IOException e) {
            System.out.println("无法连接 " + args[0]);
            System.out.println(e);
        }
    }
}
