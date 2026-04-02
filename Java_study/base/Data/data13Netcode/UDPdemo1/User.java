package Data.data13Netcode.UDPdemo1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * 目标：UDP通信入门
 * 客户端
 */
public class User {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket();
        byte[] bys = "hello,UDP".getBytes();
        //使用本机IP地址
        DatagramPacket dp = new DatagramPacket(bys,bys.length,InetAddress.getLocalHost(),9999);
        socket.send(dp);
        socket.close();
        
    }
    
}
