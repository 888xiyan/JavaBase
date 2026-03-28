package Java_study.TrainProject.FileClassify;
import java.io.File;
import java.util.ArrayList;



public class Servies {
    private static ArrayList<File> imageList= new ArrayList<>();
    private static ArrayList<File> image_downloadList= new ArrayList<>();
    private static ArrayList<File> IMGList= new ArrayList<>();
    private static ArrayList<File> ScreenshotList= new ArrayList<>();
    private static ArrayList<File> mp4List= new ArrayList<>();
    private static ArrayList<File> otherList= new ArrayList<>();
    //分类
    public static void Classify(
        File[] AbsoluteList,
        String name1,String name2,
        String name3,String name4,
        String name5,String name6
    )
    {
        for(File NameFile : AbsoluteList)
        {
            String Name = NameFile.getName();
            if(Name.contains(name1)){imageList.add(NameFile);}
            else if(Name.contains(name2)){image_downloadList.add(NameFile);}
            else if(Name.contains(name3)){IMGList.add(NameFile);}
            else if(Name.contains(name4)){ScreenshotList.add(NameFile);}
            else if(Name.contains(name5)){mp4List.add(NameFile);}
            else otherList.add(NameFile);
        }   
    }
    public static ArrayList<File> getimageList(){return imageList;}
    public static ArrayList<File> getimage_download(){return image_downloadList;}
    public static ArrayList<File> getIMGList(){return IMGList;}
    public static ArrayList<File> getScreenshotList(){return ScreenshotList;}
    public static ArrayList<File> getmp4List(){return mp4List;}
    public static ArrayList<File> getotheList(){return otherList;}



    }




