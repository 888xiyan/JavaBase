package Data.data9IoStream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStream_1 {
    public static void main(String[] args) throws Exception {
        // OutputStream os = new FileOutputStream("JAVA_basw\\Java_study\\data_9\\xyy.txt");//覆盖
        OutputStream os = new FileOutputStream("JAVA_basw\\Java_study\\data_9\\xyy.txt",true);//追加
        os.write(97);//写入一个字节
        os.write('b');
        byte[] b = {97,98,99,100,101,102};
        os.write("\r\n".getBytes());
        os.write(b);
        byte[] b1 = "我爱你".getBytes();
        os.write(b1);
        os.close();
    }

    
}
