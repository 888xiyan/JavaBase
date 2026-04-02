package Data.data13Netcode.TCPdemo2;


import java.net.ServerSocket;
import java.net.Socket;

public class Servies {
    public static void main(String[] args) throws Exception{
    ServerSocket ss = new ServerSocket(9999);
    System.out.println("服务端启动");
    while (true) {
        System.out.println("等待客户端连接");
        //1.接收客户端连接  
        Socket s = ss.accept();
        System.out.println("一个客户端连接："+ s.getInetAddress().getHostAddress() + ":" + s.getPort());
        new MyRuunbale(s).start();
    }
    // ss.close();

        //一个线程一个客户端
  
    }
}
