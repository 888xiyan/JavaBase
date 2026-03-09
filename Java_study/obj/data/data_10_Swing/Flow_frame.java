package Java_study.obj.data.data_10_Swing;
import java.awt.FlowLayout;


import javax.swing.*;
public class Flow_frame {
    public static void main(String[] args) {
        //生成一个水平布局管理器的基础页面
        JFrame frame = new JFrame("FlowLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.add(new JButton("Button 1"));
        frame.add(new JButton("Button 2"));
        frame.add(new JButton("Button 3"));
        frame.add(new JButton("Button 4"));
        frame.add(new JButton("Button 5"));
        frame.setSize(300, 200);
        frame.setVisible(true);
        
    }
}
