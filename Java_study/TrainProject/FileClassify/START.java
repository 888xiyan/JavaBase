package Java_study.TrainProject.FileClassify;

import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import Java_study.TrainProject.FileClassify.MyRunnable.RunnableIMG;
import Java_study.TrainProject.FileClassify.MyRunnable.RunnableScreenshot;
import Java_study.TrainProject.FileClassify.MyRunnable.Runnableimage;
import Java_study.TrainProject.FileClassify.MyRunnable.Runnableimage_download;
import Java_study.TrainProject.FileClassify.MyRunnable.Runnablemp4;
import Java_study.TrainProject.FileClassify.MyRunnable.Runnableother;

public class START {
    /**
     * @work:主流
     * @path:目标文件目录
     * 
     */
    public static String FileName;
    //创建一个ArrayList[]，不限长度
    public static ArrayList<String> FilNameList = new ArrayList<>();

    public static void start(String path) {
        // TODO Auto-generated method stub
        FileName = Traverse.Search(new File(path));
        //将文件名保存在ArrayList[]
        FilNameList.add(FileName);
        //统计数目
        System.out.println(Traverse.getCount() + "个文件");
        //文件分类
        Servies.Classify(FilNameList);
        //线程池启动
        try (
            ThreadPoolExecutor myThreadPoolExecutor = 
            new ThreadPoolExecutor(
            3, 
            5, 
            1, 
            TimeUnit.SECONDS, 
            new ArrayBlockingQueue<Runnable>(10), 
            new ThreadPoolExecutor.DiscardOldestPolicy());)
        {
            //线程任务启动
            // Runnable r = new MyRunnable();
            // myThreadPoolExecutor.execute(r);
            // myThreadPoolExecutor.execute(r);
            // myThreadPoolExecutor.execute(r);
            Runnable Rimage = new Runnableimage(Servies.imageList,"image");
            Runnable Rimage_download = new Runnableimage_download(Servies.image_downloadList,"image_download");
            Runnable RIMG = new RunnableIMG(Servies.IMGList,"IMG");
            Runnable Rmp4 = new Runnablemp4(Servies.mp4List,"mp4");
            Runnable RScreenshot = new RunnableScreenshot(Servies.ScreenshotList,"Screenshot");
            Runnable Rother = new Runnableother(Servies.otherList,"other");
            myThreadPoolExecutor.execute(Rimage);
            myThreadPoolExecutor.execute(Rimage_download);
            myThreadPoolExecutor.execute(RIMG);
            myThreadPoolExecutor.execute(Rmp4);
            myThreadPoolExecutor.execute(RScreenshot);
            myThreadPoolExecutor.execute(Rother);
    
        } 
        catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }


    }

    
}
