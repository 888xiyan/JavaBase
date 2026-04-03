package NetChat1.NetChatBase.UserTest.src;
import javax.swing.*;
import java.awt.*;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 局域网聊天室完整界面
 * 包含：左侧在线人数展示区、中间聊天内容区、底部消息输入区
 */
public class ChatRoomComplete extends JFrame {
    // 核心组件
    private DefaultListModel<String> userListModel;
    private static JTextArea chatContentArea; // 聊天内容显示区
    private JList<String> onlineUserList;    // 在线人数展示列表
    private JTextField messageInput;         // 消息输入框
    private JButton sendButton;
    private Socket socket;
                  // 发送按钮
    public ChatRoomComplete(String nickname,Socket socket) {
        this(nickname);
        this.socket = socket;
    }
    public ChatRoomComplete(String nickname) {
        // 1. 窗口基础设置
        super("局域网聊天室 - " + nickname);
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(true);

        // 2. 创建主面板（分割布局：左-在线列表，右-聊天区+输入区）
        JSplitPane mainSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
        mainSplitPane.setDividerLocation(150);  // 左侧列表宽度
        mainSplitPane.setDividerSize(1);        // 分割线宽度
        mainSplitPane.setEnabled(false);        // 禁止拖动分割线

        // ==================== 左侧：在线人数展示区 ====================
        JPanel onlinePanel = new JPanel(new BorderLayout());
        onlinePanel.setBorder(BorderFactory.createTitledBorder("在线人数")); // 标题边框

        // 在线用户列表（白色背景）
        
        // 模拟在线用户数据
        
        onlineUserList = new JList<>(userListModel);
        onlineUserList.setBackground(Color.WHITE);       // 白色背景
        onlineUserList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // 单选
        onlineUserList.setFont(new Font("微软雅黑", Font.PLAIN, 14)); // 字体美化

        // 列表添加滚动条
        JScrollPane onlineScrollPane = new JScrollPane(onlineUserList);
        onlineScrollPane.setBorder(null); // 去掉滚动条边框
        onlinePanel.add(onlineScrollPane, BorderLayout.CENTER);

        // ==================== 右侧：聊天区 + 输入区 ====================
        JPanel rightPanel = new JPanel(new BorderLayout());
        rightPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        // 聊天内容显示区（浅灰色背景）
        chatContentArea = new JTextArea();
        chatContentArea.setBackground(Color.LIGHT_GRAY);
        chatContentArea.setEditable(false);
        chatContentArea.setLineWrap(true);
        chatContentArea.setWrapStyleWord(true);
        chatContentArea.setFont(new Font("微软雅黑", Font.PLAIN, 14));
        JScrollPane contentScrollPane = new JScrollPane(chatContentArea);
        rightPanel.add(contentScrollPane, BorderLayout.CENTER);

        // 底部输入面板
        JPanel inputPanel = new JPanel(new BorderLayout());
        messageInput = new JTextField();
        messageInput.setFont(new Font("微软雅黑", Font.PLAIN, 14));
        inputPanel.add(messageInput, BorderLayout.CENTER);

        // 发送按钮（绿色背景）
        sendButton = new JButton("发送");
        sendButton.setBackground(new Color(0, 153, 76));
        sendButton.setForeground(Color.WHITE);
        sendButton.setPreferredSize(new Dimension(80, 30));
        inputPanel.add(sendButton, BorderLayout.EAST);

        rightPanel.add(inputPanel, BorderLayout.SOUTH);

        // ==================== 组装所有面板 ====================
        mainSplitPane.setLeftComponent(onlinePanel);
        mainSplitPane.setRightComponent(rightPanel);
        add(mainSplitPane);
        // 群聊消息显示

        // ==================== 事件处理 ====================
        // 发送按钮点击事件
        sendButton.addActionListener(e -> {
            try {
                sendMessage();
            } catch (Exception e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        });
        // 输入框回车发送
        messageInput.addActionListener(e -> {
            try {
                sendMessage();
            } catch (Exception e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        });
    }

    /**
     * 发送消息逻辑
     * @throws Exception 
     */
    private void sendMessage() throws Exception {
        String message = messageInput.getText().trim();
        if (!message.isEmpty()) {
            OutputStream os = socket.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            dos.writeInt(1);
            dos.writeUTF(message);
            // 滚动条自动到底部
            chatContentArea.setCaretPosition(chatContentArea.getText().length());
        }
    }
    //群聊消息展示
    public static void showMessage(String message) {
        chatContentArea.append(message + "\n");
        chatContentArea.setCaretPosition(chatContentArea.getText().length());
    }
    public static void addUser(String nickname) {
        DefaultListModel<String> userListModel = new DefaultListModel<>();
        userListModel.addElement(nickname);
    }

    // 测试入口
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ChatRoomComplete("测试用户").setVisible(true);
        });
    }
}
