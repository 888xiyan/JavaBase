package NetChat1.NetChatBase.ServiesTest;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

/**
 * 局域网通信系统服务端
 * 服务端
 * 端口号：9999
 * 服务启动提示：服务端启动
 * 多线程处理：一个线程处理一个客户端
 * 接收消息
 * 消息处理：消息标签
 * 0，客户端登录消息，统计在线人数并转发给所有客户端
 * 1，群聊消息，字符串拼接后转发给所有客户端
 */

public class Servies {
    public static HashMap<Socket,String> map = new HashMap< Socket,String>();
    public static Socket socket;
    public static void main(String[] args) throws Exception{
        //主线程：服务端启动，统计在线人数，转发消息
        ServerSocket ss = new ServerSocket(Counts.ServerPorts);
        System.out.println("服务端启动");
        while (true) {
            try{
            System.out.println("等待客户端连接");
            //1.接收客户端连接  
            Socket socket = ss.accept();
            System.out.println("一个客户端连接："+
            socket.getInetAddress().getHostAddress() +
             ":" + socket.getPort());
            new MyRunnable(socket).start();
        }
            catch(Exception e){
                //从集合中剔除掉断开的客户端
                map.remove(socket);
                for(Socket socket1 : map.keySet()){
                OutputStream os1 = socket1.getOutputStream();
                DataOutputStream dos1 = new DataOutputStream(os1);
                dos1.writeUTF(map.get(socket1));
                dos1.flush();
                
                //更新在线人数列表
        }
                System.out.println("当前在线人数："+map.size());
                e.printStackTrace();}
        }
        

    }
    
}
