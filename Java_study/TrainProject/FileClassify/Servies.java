package Java_study.TrainProject.FileClassify;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;

public class Servies {
    public static ArrayList<String> NameList = new ArrayList<>();
    public static ArrayList<String> imageList= new ArrayList<>();
    public static ArrayList<String> image_downloadList= new ArrayList<>();
    public static ArrayList<String> IMGList= new ArrayList<>();
    public static ArrayList<String> ScreenshotList= new ArrayList<>();
    public static ArrayList<String> mp4List= new ArrayList<>();
    public static ArrayList<String> otherList= new ArrayList<>();
    //通过字符串中特殊字符实现分流
    public static void Classify(ArrayList<String> NameList)
    {
        for(int i = 0;i < NameList.size();i++)
        {
            String Name = NameList.get(i);
            if(Name.contains("image"))
            {
                imageList.add(Name);
            }
            if(Name.contains("image_download"))
            {
                image_downloadList.add(Name);
            }
            if(Name.contains("IMG"))
            {
                IMGList.add(Name);
            }
            if(Name.contains("Screenshot"))
            {
                ScreenshotList.add(Name);
            }
            if(Name.contains("mp4"))
            {
                mp4List.add(Name);
            }
            otherList.add(Name);
        }   
    }
    public static void CopyFile(String name,String dir)throws Exception{
    {
        String SrcName = "C:\\Users\\Lenovo\\Desktop\\2025\\Pictures\\记忆\\记忆\\" + name;
        String DestName = "C:\\Users\\Lenovo\\Desktop\\2025\\"+dir+"\\"+name;
        //创建文件输入流管道与源文件连接
        InputStream in = new FileInputStream(SrcName);
        //创建文件输出流管道与目标文件连接
        FileOutputStream out = new FileOutputStream(DestName);
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
}
