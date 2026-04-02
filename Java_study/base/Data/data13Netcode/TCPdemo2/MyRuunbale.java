package Data.data13Netcode.TCPdemo2;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

/**
 * 创建一个线程
* 一个线程一个客户端
 */
public class MyRuunbale extends Thread{
    private Socket socket;
    public MyRuunbale(Socket socket) {
        this.socket = socket;
    }
    @Override
    public void run() {

        try{
            //2.获取输入流，读取数据
            InputStream is = socket.getInputStream();
            DataInput dis = new DataInputStream(is);
            while(true){
                int ID = dis.readInt();
                String name = dis.readUTF();
                //3.获取输出流，返回数据
                System.out.println("ID:"+ID+" name:"+name);
                //返回客户端IP和端口
                System.out.println("客户端IP:"+
                socket.getInetAddress().getHostAddress());
                System.out.println("客户端端口:"+socket.getPort()); }      
        }catch (Exception e){e.printStackTrace();} 
            

        
        
    }
}

    
    

