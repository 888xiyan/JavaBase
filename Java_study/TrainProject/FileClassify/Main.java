package Java_study.TrainProject.FileClassify;

import java.util.ArrayList;

/**
 * @author ：xinjian.yao
 * @date : 2020/7/23
 * @work :文件分类
 * @updata:2026/3/28
 */
public class Main {
    public static String Absolute;
    public static void main(String[] args) {
        /**
         * @WorkStream :
         * 1. 获取指定目录下的所有文件
         * 2. 集合存储文件对象
         * 3. 创建线程池
         * 4，线程对象执行文件分类，文件复制任务
         */
        String Absolute = "C:\\Users\\Lenovo\\Desktop\\2025";
        ArrayList<String> Srcs = new ArrayList<>();
        Srcs.add("image");
        Srcs.add("image_download");
        Srcs.add("IMG");
        Srcs.add("Screenshot");
        Srcs.add("mp4");
        Srcs.add("other");
        START.start(Absolute,Srcs);

    }
    
}
