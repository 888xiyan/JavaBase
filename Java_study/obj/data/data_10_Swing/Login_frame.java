package Java_study.obj.data.data_10_Swing;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Login_frame extends JFrame implements ActionListener{
    public Login_frame() {
        this.setTitle("登录界面");
        this.setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        init();
    }
    private void init(){
        JButton btn = new JButton("登录");
        btn.addActionListener(this);
        JPanel panel = new JPanel();
        this.add(panel);//添加面板
        panel.add(btn);//添加按钮
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        JOptionPane.showMessageDialog(this, "登录成功");    
    }
    
}
