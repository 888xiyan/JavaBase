package Java_study.TrainProject.FileClassify.MyRunnable;

import java.util.ArrayList;

import Java_study.TrainProject.FileClassify.Servies;

public class Runnableother implements Runnable{
    public static ArrayList<String> List;
    public static String dir;
    public Runnableother(ArrayList<String> List,String dir) {
        Runnableother.List = List;
        Runnableother.dir = dir;
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
