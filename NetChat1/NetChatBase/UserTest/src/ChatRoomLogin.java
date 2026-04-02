package NetChat1.NetChatBase.UserTest.src;
import javax.swing.*;
import java.awt.*;

/**
 * 局域网聊天室登录界面
 * 使用Java Swing实现，界面布局与截图一致
 */
public class ChatRoomLogin extends JFrame {
    // 组件定义
    private JTextField nicknameField;  // 昵称输入框
    private JButton enterButton;       // 进入按钮
    private JButton cancelButton;      // 取消按钮

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

        // 8. 按钮事件示例（可选，你可以根据需求扩展）
        enterButton.addActionListener(e -> {
            String nickname = nicknameField.getText().trim();
            if (nickname.isEmpty()) {
                JOptionPane.showMessageDialog(this, "请输入昵称！", "提示", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "欢迎 " + nickname + " 进入聊天室！");
                // 这里可以添加进入聊天室的逻辑
            }
        });

        cancelButton.addActionListener(e -> {
            nicknameField.setText("");  // 清空输入框
            // 也可以直接退出：System.exit(0);
        });
    }

    // 主方法，程序入口

}
