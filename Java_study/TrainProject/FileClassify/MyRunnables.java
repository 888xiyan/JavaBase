package Java_study.TrainProject.FileClassify;

import java.io.File;
import java.util.ArrayList;

public class MyRunnables implements Runnable{
    private ArrayList<File> srcList;
    private File distList;
    private int DownloadBytes;
    public MyRunnables(ArrayList<File> srcList,File distList,int DownloadBytes) {
        this.srcList = srcList;
        this.distList = distList;
        this.DownloadBytes = DownloadBytes;
    }
    @Override
    public void run() {
        for (File name : srcList) {
            try {
                MyUinty.CopyFiles(name, distList,DownloadBytes);//复制
                //删除
                MyUinty.Delete(name);
                System.out.println(name.getName()+"移动成功");
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

