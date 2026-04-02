package Data.data13Netcode.UDPdemo2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * 目标：UDP多发多收
 * 客户端
 */
public class User {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket();
        System.out.println("UDP客户端启动");
        Scanner sc = new Scanner(System.in);
        while(true){
        System.out.println("请输入要发送的数据：");
        String line = sc.nextLine();
        if("exit".equals(line)){
            break;
        }
        byte[] bys = line.getBytes();
        //使用本机IP地址
        DatagramPacket dp = new DatagramPacket(bys,bys.length,InetAddress.getLocalHost(),9999);
        socket.send(dp);
        }
        socket.close();
        System.out.println("UDP客户端退出");
        sc.close();
        System.out.println("UDP客户端退出");
        
    }
    
}
