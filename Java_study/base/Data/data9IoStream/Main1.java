package Data.data9IoStream;

import java.io.FileInputStream;

public class Main1 {
    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        // 创建字节输入对象

            FileInputStream in = new FileInputStream("JAVA_basw\\Java_study\\data_9\\xyy.txt");
            //一次读完全部内容
            byte[] bytes = in.readAllBytes();
            System.out.println(new String(bytes));
            in.close();

    }
    
}
