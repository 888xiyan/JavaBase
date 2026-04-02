package Data.data13Netcode.TCPdemo1;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servies {
    public static void main(String[] args) throws Exception
    {
        ServerSocket ss = new ServerSocket(9999);
        System.out.println("服务端启动");
        //1.接收客户端连接  
        Socket s = ss.accept();
        System.out.println("一个客户端连接");
        while(true)
        {
            //2.获取输入流，读取数据
            InputStream is = s.getInputStream();
            DataInput dis = new DataInputStream(is);
            int ID = dis.readInt();
            String name = dis.readUTF();
            //3.获取输出流，返回数据
            System.out.println("ID:"+ID+" name:"+name);
            //返回客户端IP和端口
            System.out.println("客户端IP:"+
            s.getInetAddress().getHostAddress());
            System.out.println("客户端端口:"+s.getPort());
            ss.close();        
        }
    }
}
