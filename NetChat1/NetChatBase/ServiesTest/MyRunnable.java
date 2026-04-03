package NetChat1.NetChatBase.ServiesTest;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;

public class MyRunnable extends Thread{
    private Socket socket;
    public MyRunnable(Socket socket) {
        this.socket = socket;
    }
    @Override
    public void run() {
        while(true){
        try{
            InputStream is = socket.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            int ID = dis.readInt();
            switch (ID) {
                case 0:
                    LoginCounts(dis,socket);
                    //接收登录消息，返回0和当前在线人数和昵称
                    break;
                case 1:
                    setAll(dis,socket);
                    //接收消息，消息标签1，消息内容：转发给所有在线用户
                    break;
            }
        }
        catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }}    
    private static void LoginCounts(DataInputStream dis,Socket socket) throws Exception{
        //登录消息，获取当今客户端socket昵称
        String name = dis.readUTF();
        Servies.map.put(socket, name);
        System.out.println("用户"+name+"已登录");
        System.out.println("当前在线人数:"+Servies.map.size());            
        OutputStream os = socket.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        //发送消息给客户端，消息标签0，当前在线人数
        dos.writeInt(0);
        //获取map集合长度
        int MapCounts = Servies.map.size();
        dos.writeInt(MapCounts);
        for(Socket socket1 : Servies.map.keySet()){
            OutputStream os1 = socket1.getOutputStream();
            DataOutputStream dos1 = new DataOutputStream(os1);
            dos1.writeUTF(Servies.map.get(socket1));//给当前的每一个客户端发送昵称
            dos1.flush();
        }
        dos.flush();

    }

    private static void setAll(DataInputStream dis,Socket socket) throws Exception{ 
        String msg = dis.readUTF();
        // System.out.println("收到"+Servies.map.get(socket)+"发来的消息："+msg);
        for(Socket socket1 : Servies.map.keySet()){
            OutputStream os = socket1.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            //获取当前时间，并转格式
            String time = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date());
            dos.writeInt(1);
            //使用StringBuilder拼接字符串
            StringBuilder sb = new StringBuilder();
            sb.append(Servies.map.get(socket1)).append(time).append("\t\n").append(msg);
            dos.writeUTF(sb.toString());
            dos.flush();
        }
    }


}
