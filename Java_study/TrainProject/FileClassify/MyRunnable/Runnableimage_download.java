package Java_study.TrainProject.FileClassify.MyRunnable;

import java.util.ArrayList;

import Java_study.TrainProject.FileClassify.Servies;

public class Runnableimage_download implements Runnable{
    public static ArrayList<String> List;
    public static String dir;
    public Runnableimage_download(ArrayList<String> List,String dir) {
        Runnableimage_download.List = List;
        Runnableimage_download.dir = dir;
    }
    @Override
    public void run() {
        for (int i = 0; i < List.size(); i++) {
            String name = List.get(i);
            try {
                Servies.CopyFile(name, dir);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    
}
