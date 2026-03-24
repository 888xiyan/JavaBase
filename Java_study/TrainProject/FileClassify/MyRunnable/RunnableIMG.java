package Java_study.TrainProject.FileClassify.MyRunnable;

import java.util.ArrayList;

import Java_study.TrainProject.FileClassify.Servies;

public class RunnableIMG implements Runnable{
    public static ArrayList<String> List;
    public static String dir;
    public RunnableIMG(ArrayList<String> List,String dir) {
        RunnableIMG.List = List;
        RunnableIMG.dir = dir;
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
