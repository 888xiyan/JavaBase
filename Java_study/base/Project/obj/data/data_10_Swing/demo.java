package Java_study.obj.data.data_10_Swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class demo {
    public static void main(String[] args) {
                // 创建一个窗口，和按钮
        JFrame login_frame = new JFrame("登录窗口");// 创建窗口
        JPanel login_panel = new JPanel();// 创建面板
        login_frame.add(login_panel);// 添加面板
        login_frame.setSize(400,300);// 设置窗口尺寸
        login_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 设置关闭模式
        login_frame.setLocationRelativeTo(null);// 设置窗口居中
        JButton login_button = new JButton("登录");// 创建按钮
        login_button.setBounds(100,100,80,30);// 设置按钮的位置和尺寸
        login_panel.add(login_button);// 添加按钮
        login_button.addActionListener(new MyActionListener(login_frame));// 给按钮添加事件监听
        // 显示窗口
        login_frame.setVisible(true);
        //提供实现类，创建事件监听对象

    }
}
class MyActionListener implements ActionListener{
    private JFrame login_frame;
    public MyActionListener(JFrame login_frame){this.login_frame = login_frame;}

    @Override
    public void actionPerformed(ActionEvent e) {
        //弹出提示弹框
        JOptionPane.showMessageDialog(login_frame,"点击了登录按钮");
        // 提示框
        System.out.println("点击了登录按钮");

    }
}