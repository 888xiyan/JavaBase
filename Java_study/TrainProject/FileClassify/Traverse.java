package Java_study.TrainProject.FileClassify;
/**
 * 递归函数实现文件搜索 
 * 
 */
import java.io.File;

public class Traverse {
    //文件数量统计
    private static int COUNT = 0;
    public static String Search(File dir){
        /**
         * 获取一级目录文件
         * 遍历对象判断是否为文件或者文件夹
         * 判断文件名是否相同
         * 如果是文件夹
         * 递归调用
         */
        //判断传入参数是否为空，是否是文件夹
        if(dir == null || !dir.isDirectory() || !dir.exists()){//判断传入参数是否为空，是否是文件夹
            //返回
            return null;
        }
        //获取文件夹下目录的所有一级文件或文件夹对象
        File[] files = dir.listFiles();
        if(files != null && files.length>0){//判断文件列表是否为空,对象长度是否为0
            for(File f:files){
            //判断是否为文件或者文件夹
            if(f.isFile()){
                COUNT++;
                //返回文件名
                return f.getName();
                
            }
            Search(f); 
        }
        }
        return null;

    }
    public static int getCount(){return COUNT;} 
}
