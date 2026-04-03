package NetChat1.NetChatBase.UserTest.UserTest;
/**
 * 局域网通信系统客户端
 * 客户端
 * 端口号：9999
 * 登录，服务器连接，在线人数刷新，聊天界面展示，聊天功能
 */
import javax.swing.SwingUtilities;

import NetChat1.NetChatBase.UserTest.src.ChatRoomLogin;

public class APP {
        public static void main(String[] args) {
        // Swing组件需要在事件调度线程中运行
        SwingUtilities.invokeLater(() -> {
            new ChatRoomLogin().setVisible(true);
        });
    }

}
