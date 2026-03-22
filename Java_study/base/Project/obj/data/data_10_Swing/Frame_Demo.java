package Java_study.obj.data.data_10_Swing;


import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.*;
public class Frame_Demo {
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
        //给按钮添加点击事件监听器
        login_button.addActionListener(e -> {//匿名内部类
            //在login_frame中弹出一个窗口
            JOptionPane.showMessageDialog(login_frame,"登录成功！");
            System.out.println("点击了登录按钮");
        });
        //按键事件监听事件，监听用户键盘上下左右按键，并弹出提示框
        login_frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                // TODO Auto-generated method stub
                System.out.println("按下了按键");
                int keyCode = e.getKeyCode();
                switch (keyCode) {
                    case KeyEvent.VK_UP:
                        JOptionPane.showMessageDialog(login_frame,"向上按键被按下");
                        System.out.println("向上按键被按下");
                        break;
                    case KeyEvent.VK_DOWN:
                        JOptionPane.showMessageDialog(login_frame,"向下按键被按下");
                        System.out.println("向下按键被按下");
                        break;
                    case KeyEvent.VK_LEFT:
                        JOptionPane.showMessageDialog(login_frame,"向左按键被按下");
                        System.out.println("向左按键被按下");
                        break;
                        
                    case KeyEvent.VK_RIGHT:
                        JOptionPane.showMessageDialog(login_frame,"向右按键被按下");
                        System.out.println("向右按键被按下");
                        break;
                }
                
            }
        });
        login_frame.setVisible(true);// 显示窗口
        //让窗口成为焦点
        login_frame.requestFocus();
    }
}
