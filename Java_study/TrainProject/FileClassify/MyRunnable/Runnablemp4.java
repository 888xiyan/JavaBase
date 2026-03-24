package Java_study.TrainProject.FileClassify.MyRunnable;

import java.util.ArrayList;

import Java_study.TrainProject.FileClassify.Servies;

public class Runnablemp4 implements Runnable{
    public static ArrayList<String> List;
    public static String dir;
    public Runnablemp4(ArrayList<String> List,String dir) {
        Runnablemp4.List = List;
        Runnablemp4.dir = dir;
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
