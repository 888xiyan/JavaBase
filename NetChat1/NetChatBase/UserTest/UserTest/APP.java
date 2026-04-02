package NetChat1.NetChatBase.UserTest.UserTest;

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
