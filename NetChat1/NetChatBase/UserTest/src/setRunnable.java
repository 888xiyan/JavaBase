package NetChat1.NetChatBase.UserTest.src;
import java.io.DataInputStream;
import java.io.InputStream;
/**
 * 接收服务端发送的消息
 * 在线人数
 * 聊天记录
 * 
 */
import java.net.Socket;

public class setRunnable extends Thread {
    private Socket socket;

    public setRunnable(Socket socket) {
    	this.socket = socket;
    }
    @Override
    public void run() {
        try {
            InputStream is = socket.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            int ID = dis.readInt();
            switch (ID) {
                case 0:
                    //接收到在线人数
                    int OnlineCounts = dis.readInt();
                    for(int i = 0; i < OnlineCounts; i++){
                        String nickname = dis.readUTF();
                        //在线人数展示
                        ChatRoomComplete.addUser(nickname);
                    }break;
                    case 1:
                    //接收聊天记录
                    String message = dis.readUTF();
                    ChatRoomComplete.showMessage(message);
                    
                    
                    break;
            
                default:
                    break;
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
