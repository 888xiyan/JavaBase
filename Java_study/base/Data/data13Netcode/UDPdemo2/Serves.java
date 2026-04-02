package Data.data13Netcode.UDPdemo2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * 目标：UDP服务端
 */
public class Serves {
    public static void main(String[] args) throws Exception {
        //1.创建一个UDP服务端对象
        DatagramSocket socket = new DatagramSocket(9999);
        System.out.println("服务端启动");
        //2.创建一个数据包对象，用于接收数据
        byte[] buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);
        //3.调用方法，接收数据
        socket.receive(packet);
        System.out.println("数据是：" + new String(buf));
        String ip = packet.getAddress().getHostAddress();
        System.out.println("来自："+ip + packet.getPort());
        socket.close();
    }
    
}
