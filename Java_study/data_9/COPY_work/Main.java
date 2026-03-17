package Java_study.data_9.COPY_work;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws Exception
    {
        //使用字节流复制文件
        //源文件：C:\Users\Lenovo\Desktop\Screenshots\225，杨宏屹.jpg
        // 目标文件：C:\Users\Lenovo\Desktop\Screenshots\2025\225，杨宏屹.jpg
        //创建管道
        copyFile("C:\\Users\\Lenovo\\Desktop\\Screenshots\\225，杨宏屹.jpg","C:\\Users\\Lenovo\\Desktop\\Screenshots\\2025\\225，杨宏屹.jpg");

    }
    // 复制功能
    public static void copyFile(String src,String dest) throws Exception
    {
        //创建文件输入流管道与源文件连接
        InputStream in = new FileInputStream(src);
        //创建文件输出流管道与目标文件连接
        FileOutputStream out = new FileOutputStream(dest);
        byte[] buffer = new byte[1024];
        int len;
        while ((len = in.read(buffer)) != -1) {
            out.write(buffer,0,len);
        }
        out.close();
        in.close();
        System.out.println("复制完成");

    }
    }

    

