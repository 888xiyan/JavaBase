package Data.data13Netcode.TCPdemo1;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class User {
    public static void main(String[] args) throws Exception
    {
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端启动");
        OutputStream os = socket.getOutputStream();
        Scanner sc = new Scanner(System.in);
        while(true)
        {
        String line = sc.nextLine();
        if("exit".equals(line))
        {
            break;
        }
        System.out.println("请输入内容：");
        //字节输出流，高级流包装低级流
        DataOutputStream dos = new DataOutputStream(os);
        dos.writeInt(1);
        dos.writeUTF(line);
        System.out.println("发送成功");
        }
        socket.close();
        sc.close();
        System.out.println("客户端关闭");

    }
    
}
