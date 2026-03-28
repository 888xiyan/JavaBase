package Java_study.TrainProject.FileClassify;

import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class START {
    /**
     * @work:主流
     * @path:目标文件目录
     * 
     */ 

    public static void start(String path,ArrayList<String> srcList) {
        // 获取所有文件
       File dir = new File(path); 
       File[] allFiles = MyUinty.Search(dir);
       ArrayList<File> srclist = new ArrayList<File>();
       //创建文件夹
       for(String name : srcList){
        srclist.add(MyUinty.CreateDir(new File(name),dir));}
    
       //分类文件
       Servies.Classify(allFiles,"image",
       "image_download","IMG",
       "Screenshot","mp4",
       "other");
       //多线程启动
        try(ThreadPoolExecutor MTP =  MyUinty.MyThreadPoolExecutor(4, 6,
        100, TimeUnit.SECONDS);)
        {
        MyRunnables myRunnables = new MyRunnables(Servies.getimageList(),new File(path+"\\\\image"),2048);
        MyRunnables myRunnables1 = new MyRunnables(Servies.getimageList(),new File(path+"\\\\image_download"),2048);
        MyRunnables myRunnables2 = new MyRunnables(Servies.getimageList(),new File(path+"\\\\IMG"),2048);
        MyRunnables myRunnables3 = new MyRunnables(Servies.getimageList(),new File(path+"\\\\Screenshot"),2048);
        MyRunnables myRunnables4 = new MyRunnables(Servies.getimageList(),new File(path+"\\\\mp4"),2048);
        MyRunnables myRunnables5 = new MyRunnables(Servies.getmp4List(),new File(path+"\\\\other"),20480);        
        MTP.execute(myRunnables);
        MTP.execute(myRunnables1);
        MTP.execute(myRunnables2);
        MTP.execute(myRunnables3);
        MTP.execute(myRunnables4);
        MTP.execute(myRunnables5);
        
        }  
        catch(Exception e)
        {e.printStackTrace();} 
}}