package NetChat1.NetChatBase.UserTest.src;
/**
 * 功能：
 * 登录界面
 * 聊天室入口
 * 接收消息线程启动入口
 */




import javax.swing.*;
import NetChat1.NetChatBase.UserTest.UserTest.Counts;
import java.awt.*;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 局域网聊天室登录界面
 * 使用Java Swing实现，界面布局与截图一致
 */
public class ChatRoomLogin extends JFrame {
    // 组件定义
    private JTextField nicknameField;  // 昵称输入框
    private JButton enterButton;       // 进入按钮
    private JButton cancelButton;       // 取消按钮
    private Socket socket;      

    public ChatRoomLogin() {
        // 1. 设置窗口基本属性
        super("局域网聊天室");  // 窗口标题
        setSize(350, 180);      // 窗口大小
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // 关闭窗口退出程序
        setLocationRelativeTo(null);  // 窗口居中显示
        setResizable(false);          // 禁止调整窗口大小

        // 2. 创建主面板，使用网格袋布局（更精准控制组件位置）
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);  // 组件间距

        // 3. 添加昵称标签
        JLabel nicknameLabel = new JLabel("昵称：");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;  // 标签右对齐
        mainPanel.add(nicknameLabel, gbc);

        // 4. 添加昵称输入框
        nicknameField = new JTextField(15);  // 输入框宽度
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;  // 输入框左对齐
        mainPanel.add(nicknameField, gbc);

        // 5. 添加按钮面板（存放进入和取消按钮）
        JPanel buttonPanel = new JPanel();
        enterButton = new JButton("进入");
        enterButton.setBackground(Color.BLUE);    // 按钮背景色
        enterButton.setForeground(Color.WHITE);  // 按钮文字色
        cancelButton = new JButton("取消");
        cancelButton.setBackground(Color.RED);
        cancelButton.setForeground(Color.WHITE);

        // 按钮间距
        buttonPanel.add(enterButton);
        buttonPanel.add(Box.createHorizontalStrut(20));  // 按钮之间的水平间距
        buttonPanel.add(cancelButton);

        // 6. 添加按钮面板到主面板
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;  // 跨两列显示
        gbc.anchor = GridBagConstraints.CENTER;  // 按钮面板居中
        mainPanel.add(buttonPanel, gbc);

        // 7. 将主面板添加到窗口
        add(mainPanel);
        

        // 8. 按钮事件
        enterButton.addActionListener(e -> mainServeas());

    }
    public void mainServeas() {
        String nickname = nicknameField.getText().trim();//获取昵称
            nicknameField.setText(""); 
            if (nickname.isEmpty()) {
                JOptionPane.showMessageDialog(this, "请输入昵称！", "提示", JOptionPane.WARNING_MESSAGE);
            } else {
                try {
                    socket = new Socket(Counts.ServerIP, Counts.ServerPorts);
                    // 创建Socket对象，指定服务器IP和端口号
                    LinkServes(nickname,socket);
                    System.out.println("已连接服务器");
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                //聊天室进入
                JOptionPane.showMessageDialog(this, "欢迎 " + nickname + " 进入聊天室！");
                //关闭登录界面
                dispose();
                // 这里可以添加进入聊天室的逻辑
                SwingUtilities.invokeLater(() -> {
                new ChatRoomComplete(nickname,socket).setVisible(true);
        });
            }

    }

    public static void LinkServes(String nickname,Socket socket) {
        try {
            
            //主线程处理消息发送
            //登录消息发送
            // 创建输出流，用于发送消息给服务器
            OutputStream ops = socket.getOutputStream();
            DataOutputStream dos = new DataOutputStream(ops);
            dos.writeInt(0);//消息标签
            dos.writeUTF(nickname);//昵称发送
            dos.flush();
            System.out.println("已发送登录消息");
            //接收消息的独立线程启动
            new setRunnable(socket).start();

        }catch(Exception e) {
            e.printStackTrace();
        }
    }

}
