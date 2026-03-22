package Data.data9IoStream;

import java.io.FileInputStream;

public class Main {
    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        // 创建字节输入对象

            FileInputStream in = new FileInputStream("JAVA_basw\\Java_study\\data_9\\xyy.txt");
            byte[] b = new byte[3];
            int len;
            while ((len = in.read(b)) != -1) {
                String str = new String(b,0,len);
                System.out.print(str);
            }
            in.close();


    }
    
}
